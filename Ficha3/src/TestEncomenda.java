import java.util.ArrayList;

public class TestEncomenda {

    public static void main(String[] args) {
        LinhaDeEncomenda le1 = new LinhaDeEncomenda("123","Umas batatas",20,30);
        LinhaDeEncomenda le2 = new LinhaDeEncomenda("231","Umas batatas",10,20);
        LinhaDeEncomenda le3 = new LinhaDeEncomenda("312","Umas batatas",5,10);
        ArrayList<LinhaDeEncomenda> linhas = new ArrayList<>();
        linhas.add(le1);
        linhas.add(le2);
        linhas.add(le3);
        Encomenda e1 = new Encomenda("Jose","1342","Gualtar",1782,"27-04-2000",linhas);

        System.out.println("Primeiro : \n" + e1.toString());

        e1.adicionaLinha(le3);
        e1.removeProduto("312");
        System.out.println(e1.existeProdutoEncomenda("123"));
        System.out.println(e1.numeroTotalProdutos());

        System.out.println("\n\n Segundo : " + e1.toString());
    }
}
