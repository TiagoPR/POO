import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Utilizador {
    private String email ;
    private String password;
    private String nome ;
    private boolean genero;
    private double altura;
    private double peso;
    private LocalDate nascimento;
    private String desportoFavorito;
    private Map<String,Atividade> realizados;

    public Utilizador(){
        email = "/na";
        password = "/na";
        nome = "/na";
        genero = true;
        altura = 0;
        peso = 0;
        nascimento = LocalDate.now();
        desportoFavorito = "/na";
        realizados = new HashMap<>();
    }

    public Utilizador(String email, String password, String nome, boolean genero, double altura, double peso,
                      LocalDate nascimento, String desportoFavorito, Map<String, Atividade> realizados) {
        this.email = email;
        this.password = password;
        this.nome = nome;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.nascimento = nascimento;
        this.desportoFavorito = desportoFavorito;
        this.realizados = realizados;
    }

    public Utilizador(Utilizador umUtilizador){
        this.email = umUtilizador.getEmail();
        this.password = umUtilizador.getPassword();
        this.nome = umUtilizador.getNome();
        this.genero = umUtilizador.isGenero();
        this.altura = umUtilizador.getAltura();
        this.peso = umUtilizador.getPeso();
        this.nascimento = umUtilizador.getNascimento();
        this.desportoFavorito = umUtilizador.getDesportoFavorito();
        this.realizados = umUtilizador.getRealizados();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getDesportoFavorito() {
        return desportoFavorito;
    }

    public void setDesportoFavorito(String desportoFavorito) {
        this.desportoFavorito = desportoFavorito;
    }

    public Map<String, Atividade> getRealizados() {
        return this.realizados.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e-> e.getValue().clone()));
    }

    public void setRealizados(Map<String, Atividade> realizados) {
        this.realizados = realizados;
    }

    public void addAtividade(Atividade ola){
        this.realizados.put(ola.getId(),ola.clone());
    }

    public Utilizador clone(){
        return new Utilizador(this);
    }
}
