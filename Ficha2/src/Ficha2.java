import java.lang.reflect.Array;
import java.util.Arrays;

public class Ficha2 {

    /* Exercício 1 */

    public int minimo(int[] valores){
        int min = Integer.MAX_VALUE;

        if (valores.length == 0) System.out.println("Input errado");

        for(int v : valores){
            if(v < min) min = v;
        }

        return min;
    }

    public int[] comuns(int [] a1, int[] a2){
        /*int[] ret = new int[a1.length];
        int count = 0;
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i : a1){
            int r = Arrays.binarySearch(a2, i);
            if (r != -1 ) {
                ret[count++] = a2[r];
            }
        }

        int[] realRes = new int[count];
        System.arraycopy(ret,0,realRes,0,count);

        return realRes;*/
        int[] tempArray = new int[Math.max(a1.length, a2.length)];

        int i = 0;
        for(int element1 : a1) {
            for(int element2 : a2) {
                if(element1 == element2) {
                    tempArray[i++] = element1;
                    break;
                }
            }
        }

        int[] newArray = new int[i];
        for(int j = 0; j < i; j++)
            newArray[j] = tempArray[j];

        return newArray;
    }
}
