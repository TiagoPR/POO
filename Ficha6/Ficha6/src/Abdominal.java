public class Abdominal extends Atividade{
    private String tipo;
    private int nRep;

    public Abdominal(){
        tipo = "/na";
        nRep = 0;
    }

    public Abdominal(Abdominal abdominal){
        tipo = abdominal.getTipo();
        nRep = abdominal.getnRep();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnRep() {
        return nRep;
    }

    public void setnRep(int nRep) {
        this.nRep = nRep;
    }

    @Override
    public double valorCalorias() {
        return 0;
    }

    public Abdominal clone(){
        return new Abdominal(this);
    }
}
