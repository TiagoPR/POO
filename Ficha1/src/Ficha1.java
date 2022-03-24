import java.time.LocalDateTime;

public class Ficha1 {
    public double celsiusParaFarenheit(double graus){
        return (graus * 1.8) + 32;
    }

    public int maximoNumeros(int a, int b)
    {
        if(a >= b){
            return a;
        }
        else return b;
    }

    public String criaDescricaoConta(String nome, double saldo){
        return "Nome: " + nome + "\n" + "Saldo: " + saldo;
    }

    public double eurosParaLibras(double valor, double taxaConversao){
        return valor*taxaConversao;
    }

    public int doisinteiros(int a, int b){
        System.out.println(Math.max(a,b) + " " + Math.min(a,b));
        return ((a+b)/2);
    }

    public long factorial(int num){
        if (num <= 1) {
            return 1;
        }
        else
            return num * factorial(num-1);
    }

    public long fibonacci(int num){
        if(num == 0){
            return 0;
        }
        else if(num == 1) return 1;
        else return fibonacci(num-1) + fibonacci(num-2);
    }

    public long tempoGasto(){
        long x = System.currentTimeMillis();
        factorial(5000);
        fibonacci(20);
        long y = System.currentTimeMillis();
        return y-x;
    }

}
