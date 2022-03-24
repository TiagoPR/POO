public class TestePauta {
    public static void main(String[] args) {
        // int[][] pauta = new int[5][5];
        int [][] pauta = {{12,13,10,4,20},{5,7,8,9,2},{15,17,18,19,12},{5,17,8,9,12},{15,7,18,19,2}};;
        Pauta p = new Pauta();

        p.setPauta(pauta);
        p.toString2();
        System.out.println(p.somaDasNotas(1));
        System.out.println(p.mediaAluno(0));
        System.out.println(p.mediaUC(1));
    }
}
