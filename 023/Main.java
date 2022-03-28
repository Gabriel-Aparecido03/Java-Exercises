import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        float valor,valorFinal;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.println("Insira o valor do produto: ");
        valor = ler.nextFloat();

        if(valor > 20) {
            valorFinal = valor + valor*0.45f;
            System.out.println("O valor será :"+valorFinal);
        }
        else {
            valorFinal = valor + valor*.3f;
            System.out.println("O valor será :"+valorFinal);
        }
    }   
}