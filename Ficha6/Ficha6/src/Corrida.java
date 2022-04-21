public class Corrida extends Atividade{
    private int distanciaPercorrida;
    private String percursoEfetuado;
    private int altimetria;

    public Corrida(){
        distanciaPercorrida = 0;
        percursoEfetuado = "/na";
        altimetria = 0;
    }

    public Corrida(Corrida umaCorrida){
        distanciaPercorrida = umaCorrida.getDistanciaPercorrida();
        percursoEfetuado = umaCorrida.getPercursoEfetuado();
        altimetria = umaCorrida.getAltimetria();
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public String getPercursoEfetuado() {
        return percursoEfetuado;
    }

    public void setPercursoEfetuado(String percursoEfetuado) {
        this.percursoEfetuado = percursoEfetuado;
    }

    public int getAltimetria() {
        return altimetria;
    }

    public void setAltimetria(int altimetria) {
        this.altimetria = altimetria;
    }

    public double valorCalorias(Utilizador user)
    {
        return 0;
    }

    public Corrida clone(){
        return new Corrida(this);
    }
}
