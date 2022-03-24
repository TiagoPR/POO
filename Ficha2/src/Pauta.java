
  /* Exercício 2 */

  import java.util.Arrays;

  public class Pauta {

    private int[][] pauta;

    public Pauta(){
        this.pauta = new int[5][5];
    }

    public void setPauta(int [][] p){
        for(int i=0; i<p.length; i++)
            for(int j=0; j<p[i].length; j++)
                pauta[i][j]=p[i][j];
    }

    public double somaDasNotas(int uc){
        int ret=0;
        for (int[] v : pauta){
            ret += v[uc];
        }
        return ret;
    }

    public double mediaAluno(int nAluno){
        double soma = 0;
        for (int i = 0;i< pauta.length;i++){
            soma += pauta[nAluno][i];
        }
        return soma/pauta.length;
    }

    public double mediaUC(int uc){
        return somaDasNotas(uc)/pauta[0].length;
    }

    public void toString2(){
        String ret;
        for (int[] v : pauta) {
            System.out.println(Arrays.toString(v));
        }
    }
  }
