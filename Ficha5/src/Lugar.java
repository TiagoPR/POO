import java.util.Objects;

public class Lugar {
    /** Matricula do veiculo estacionado */
    private String matricula ;
    /** Nome do proprietario */
    private String nome ;
    /** Tempo atribuido ao lugar , em minutos */
    private int minutos ;
    /** Indica se lugar é permanente , ou de aluguer */
    private boolean permanente ;

    public Lugar(){
        this.matricula = "n/a";
        this.nome = "n/a";
        this.minutos = 0;
        this.permanente = false;
    }

    public Lugar(String matricula, String nome, int minutos, boolean permanente) {
        this.matricula = matricula;
        this.nome = nome;
        this.minutos = minutos;
        this.permanente = permanente;
    }

    public Lugar(Lugar umLugar){
        this.matricula = umLugar.getMatricula();
        this.nome = umLugar.getNome();
        this.minutos = umLugar.getMinutos();
        this.permanente = umLugar.isPermanente();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public boolean isPermanente() {
        return permanente;
    }

    public void setPermanente(boolean permanente) {
        this.permanente = permanente;
    }

    @Override
    public String toString() {
        return "Lugar{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", minutos=" + minutos +
                ", permanente=" + permanente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lugar lugar = (Lugar) o;
        return minutos == lugar.minutos && permanente == lugar.permanente && Objects.equals(matricula, lugar.matricula) && Objects.equals(nome, lugar.nome);
    }

    public Lugar clone(){
        return new Lugar(this);
    }
}
