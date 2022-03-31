import java.util.*;
import java.util.stream.Collectors;

public class GestaoEncomendas {
    private Map<Integer,Encomenda> encomendas;

    public GestaoEncomendas(){
        this.encomendas = new HashMap<>();
    }

    public GestaoEncomendas(Map<Integer, Encomenda> encomendas) {
        this.encomendas = encomendas.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e-> e.getValue().clone()));
    }

    public GestaoEncomendas(GestaoEncomendas umaGestao){

    }

    public Map<Integer, Encomenda> getEncomendas() {
        return this.encomendas.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e-> e.getValue().clone()));
    }

    public void setEncomendas(Map<Integer, Encomenda> encomendas) {
        for (Map.Entry<Integer,Encomenda> e : encomendas.entrySet()){
            this.encomendas.put(e.getKey(),e.getValue().clone());
        }
    }

    public GestaoEncomendas clone(){
        return new GestaoEncomendas(this);
    }

    @Override
    public String toString() {
        return "GestaoEncomendas{" +
                "encomendas=" + encomendas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GestaoEncomendas that = (GestaoEncomendas) o;
        return Objects.equals(encomendas, that.encomendas);
    }

    public Set<Integer> todosCodigosEnc(){
        return new HashSet<>(this.encomendas.keySet());
    }

    public void addEncomenda(Encomenda enc){
        this.encomendas.put(enc.getNEnc(),enc.clone());
    }

    public Encomenda getEncomenda(int codEnc){
        return this.encomendas.get(codEnc).clone();
    }

    public void removeEncomenda(int codEnc){
        this.encomendas.remove(codEnc);
    }

    public int encomendaComMaisProdutos(){
        Comparator<Encomenda> c = (e1,e2) -> e2.numeroTotalProdutos() - e1.numeroTotalProdutos();
        Encomenda e = this.encomendas.values().stream().sorted(c).findFirst().orElse(null);
        return e == null ? 0 : e.getNEnc();
    }


}
