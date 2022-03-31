import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CasaInteligente {
    private List<Lampada> lampadaList;

    public CasaInteligente(){
        lampadaList = new ArrayList<>();
    }

    public CasaInteligente(List<Lampada> lampadas) {
        this.lampadaList = new ArrayList<>();
        for (Lampada a : lampadas){
            this.lampadaList.add(a.clone());
        }
    }

    public CasaInteligente(CasaInteligente umaCasaInteligente){
        this.lampadaList = new ArrayList<>();
        for (Lampada a : umaCasaInteligente.getLampadaList()){
            this.lampadaList.add(a.clone());
        }
    }

    public List<Lampada> getLampadaList() {
        return this.lampadaList.stream().map(Lampada::clone).collect(Collectors.toList());
    }

    public void setLampadaList(List<Lampada> lampadaList) {
        this.lampadaList = lampadaList.stream().map(a -> a.clone()).collect(Collectors.toList());
    }

    /* Exercícios */

    public void addLampada(Lampada l){
        this.lampadaList.add(l.clone());
    }

    public void ligaLampadaNormal(int index){
        this.lampadaList.get(index).setModo(Lampada.Modo.ON);
    }

    public void ligaLampadaECO(int index){
        this.lampadaList.get(index).setModo(Lampada.Modo.ECO);
    }

    public int qtEmECO(){
        return (int) this.lampadaList.stream().filter(a -> a.getModo().equals(Lampada.Modo.ECO)).count();
    }

    public void removeLampada(int index){
        this.lampadaList.remove(index);
    }

    public void ligaTodasECO(){
        this.lampadaList.forEach(a -> a.setModo(Lampada.Modo.ECO));
    }

    public void ligaTodasMAX(){
        this.lampadaList.forEach(a -> a.setModo(Lampada.Modo.ON));
    }

    public double consumoTotal(){
        return this.lampadaList.stream().mapToDouble(Lampada::getConsumoTotal).sum();
    }

    public Lampada maisGastadora(){
        Lampada maior = new Lampada();
        for (Lampada a : this.lampadaList){
            if (a.getConsumoTotal() > maior.getConsumoTotal()){
                maior = a.clone();
            }
        }
        return maior;
    }

    public Lampada menosGastadora(){
        Lampada menor = new Lampada();
        menor.setConsumoTotal(Integer.MAX_VALUE);
        for (Lampada a : this.lampadaList){
            if (a.getConsumoTotal() < menor.getConsumoTotal()){
                System.out.println("LAMPADA MENOS GASTADORA" + a.toString());
                menor = a.clone();
                System.out.println("CLONE DELA " + menor.toString());
            }
        }
        return menor;
    }

    public Set<Lampada> podiumEconomia(){
        Set<Lampada> ret = new HashSet<>();
        if (this.lampadaList.size() < 3){
            ret = this.lampadaList.stream().map(Lampada::clone).collect(Collectors.toSet());
            return ret;
        }
        int count = 0;
        CasaInteligente clone = new CasaInteligente(this);
        System.out.println("CLONE DO METODO: " + clone.toString());
        Lampada menor;
        while (count < 3){
            System.out.println("WHILE" + count);
            menor = clone.menosGastadora();
            ret.add(menor.clone());
            clone.lampadaList.remove(menor);
            count++;
            System.out.println("LAMPADA " + count + menor.toString());
        }

        return ret;
    }

    public void reset(){
        this.lampadaList.forEach(a -> a.setConsumoTotal(0));
    }

    public CasaInteligente clone(){
        return new CasaInteligente(this);
    }

    @Override
    public String toString() {
        return "CasaInteligente{" +
                "lampadaList=" + getLampadaList().toString() +
                '}';
    }
}
