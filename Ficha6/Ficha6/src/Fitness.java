import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fitness {
    Map<String ,Utilizador> utilizadores;

    public Fitness(Map<String, Utilizador> utilizadores)
    {
        this.utilizadores = utilizadores.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e-> e.getValue().clone()));

    }
    public Fitness()
    {
        this.utilizadores = new HashMap<>();
    }
    public void addUtilizador (Utilizador util)
    {
        this.utilizadores.put(util.getNome(), util.clone());
    }

    public boolean existeUtilizador (String Email)
    {
        return this.utilizadores.containsKey(Email);
    }

    public int quantos()
    {
        return this.utilizadores.size();
    }

    public int quantos(String actividade, String email)
    {
        return this.utilizadores.get(email).getRealizados().size();
    }

    public Utilizador getUtilizador(String email)
    {
        return this.utilizadores.get(email).clone();
    }

    public void adiciona(String email, Atividade act)
    {
        this.utilizadores.get(email).addAtividade(act);
    }

    public List<Atividade> getAllActividades()
    {
        List<Atividade> lista = new ArrayList<>();
        this.utilizadores.values().forEach(e -> e.getRealizados().values().forEach(b->lista.add(b.clone())));
        return lista;
    }

}
