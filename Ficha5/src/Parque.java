import java.util.*;
import java.util.stream.Collectors;

public class Parque {
    private String nome;
    private Map<String,Lugar> lugares;

    public Parque(){
        this.nome = "n/a";
        this.lugares = new HashMap<>(); // TreeMap<>()
    }

    public Parque(String nome, Map<String, Lugar> lugares) {
        this.nome = nome;
        /*for (String chave : lugares.keySet()){
            Lugar a = lugares.get(chave);
            this.lugares.put(chave,a.clone());
        }*/
        // ou
        /*for (Lugar a: lugares.values()){
            String chave = a.getMatricula();
            this.lugares.put(chave,a.clone());
        }*/
        //ou
        /*for (Map.Entry<String,Lugar> e : lugares.entrySet()){
            this.lugares.put(e.getKey(),e.getValue().clone());
        }*/
        //ou
        this.lugares = lugares.entrySet()
                                .stream()
                                .collect(Collectors.toMap(e-> e.getKey(),e-> e.getValue().clone()));
    }

    public Parque(Parque umParque){
        this.nome = umParque.getNome();
        this.lugares = umParque.getLugares();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<String, Lugar> getLugares() {
        HashMap<String,Lugar> ret = new HashMap<>();
        for (Map.Entry<String,Lugar> e : this.lugares.entrySet()){
            ret.put(e.getKey(),e.getValue().clone());
        }
        return ret;
    }

    public void setLugares(Map<String, Lugar> lugares) {
        for (Map.Entry<String,Lugar> e : lugares.entrySet()){
            this.lugares.put(e.getKey(),e.getValue().clone());
        }
    }

    @Override
    public String toString() {
        return "Parque{" +
                "nome='" + nome + '\'' +
                ", lugares=" + lugares +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parque parque = (Parque) o;
        return Objects.equals(nome, parque.nome) && Objects.equals(lugares, parque.lugares);
    }

    public Parque clone(){
        return new Parque(this);
    }

    /* Exercícios */

    public List<String> matriculas(){
        return new ArrayList<>(this.lugares.keySet());
    }

    public void novoLugar(Lugar umLugar){
        this.lugares.put(umLugar.getMatricula(), umLugar.clone());
    }

    public void removeLugar(String matricula){
        this.lugares.remove(matricula);
    }

    public void alteraTempo(int minutos,String matricula){
        this.lugares.get(matricula).setMinutos(minutos);
    }

    public int totalMinutosInterno(){
        return this.lugares.values().stream().mapToInt(Lugar::getMinutos).sum();
    }

    public int totalMinutosExterno(){
        Iterator<Lugar> it = this.lugares.values().iterator();
        int sum = 0;

        while (it.hasNext()){
            sum += it.next().getMinutos();
        }

        return sum;
    }

    public boolean existeLugar(String matricula){
        return this.lugares.containsKey(matricula);
    }

    public List<String> tempoAtribuido(int tempo){
        return this.lugares.entrySet().stream()
                .filter(e -> e.getValue().getMinutos() < tempo && e.getValue().isPermanente())
                .map(e -> e.getKey()).collect(Collectors.toList());
    }

    public List<Lugar> getSoLugares(){
        return this.lugares.values().stream().map(Lugar::clone).collect(Collectors.toList());
    }

}
