import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CasaInteligenteTest {
    public static void main(String[] args)
    {
        Lampada oi = new Lampada(Lampada.Modo.ECO,1,2,30,30);
        Lampada oi1 = new Lampada(Lampada.Modo.ON,2,3,40,30);
        Lampada oi2 = new Lampada(Lampada.Modo.ON,1,3,50,30);
        Lampada oi3 = new Lampada(Lampada.Modo.ECO,4,1,20,30);
        ArrayList<Lampada> lista = new ArrayList<>();
        lista.add(oi);
        lista.add(oi1);
        lista.add(oi2);
        lista.add(oi3);
        CasaInteligente ci = new CasaInteligente(lista);
        System.out.println(ci.toString());
        Set<Lampada> ret = ci.podiumEconomia();
        System.out.println(ret.toString());
    }
}
