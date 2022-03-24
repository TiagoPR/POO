import java.time.LocalDateTime;
import java.util.Scanner;

public class Experimentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        // System.out.println("Ola " + nome);

        Ficha1 ficha = new Ficha1();
        int a = ficha.maximoNumeros(20,30);
        System.out.println(a);
        System.out.println(ficha.celsiusParaFarenheit(20) + " " + ficha.maximoNumeros(20,30)
                + "\n" + ficha.criaDescricaoConta("Bruno", 0));
        System.out.println("\nEuro para libra: " + ficha.eurosParaLibras(500,0.8));
        System.out.println(ficha.doisinteiros(20,40));
        System.out.println("Fatorial: " + ficha.factorial(input));
        System.out.println(ficha.tempoGasto());
    }
}
