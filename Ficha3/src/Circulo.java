import java.util.Objects;

public class Circulo {
    private double x,y,raio;

    public Circulo(){
        this.x = this.y = 0;
        this.raio = 1;
    }

    public Circulo(double x , double y , double raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo umCirculo){
        this.x = umCirculo.getX();
        this.y = umCirculo.getY();
        this.raio = umCirculo.getRaio();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRaio() {
        return raio;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void alteraCentro(double x, double y){
        setX(x);
        setY(y);
    }

    public double calculaArea(){
        return (Math.PI * Math.pow(raio,2));
    }

    public double calculaPerimetro(){
        return Math.PI * (2*raio);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return this.x == circulo.getX() && this.y == circulo.getY() && this.raio == circulo.getRaio();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("X: ").append(this.x).append("\n");
        sb.append("Y: ").append(this.y).append("\n");
        sb.append("Raio: ").append(this.raio).append("\n");

        return sb.toString();
    }

    public Circulo clone(){
        return new Circulo(this.x,this.y,this.raio);
    }

}
