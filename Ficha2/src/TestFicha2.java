import java.util.Arrays;
import java.util.Scanner;

public class TestFicha2 {

    private static int[] lerArrayInt(int n){
        Scanner sc = new Scanner(System.in);
        int[] res = new int[n];

        for (int i = 0; i<n; i++){
            System.out.print("Valor na posição " +i+ ":");
            res[i] = sc.nextInt();
        }
        sc.close();
        return res;
    }

    public static void main(String[] args) {
        Ficha2 f = new Ficha2();

        int [] arr;

        //arr = lerArrayInt(10);
        //System.out.println(Arrays.toString(arr));
        //System.out.println("Mínimo :" + f.minimo(arr));

        int [] arr1 = {3,1,2,3,2};
        int [] arr2 = {5,2,3,4,2};

        System.out.println(Arrays.toString(f.comuns(arr1,arr2)));

        /* Exercício 2 */

        int [][] alXUc = {{12,13,10,4,20},{5,7,8,9,2},{15,17,18,19,12},{5,17,8,9,12},{15,7,18,19,2}};


    }
}
