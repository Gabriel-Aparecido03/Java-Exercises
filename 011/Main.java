
import java.util.Scanner ;

class Main {
    public static void main(String args[]) {
        float num;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.println("Informe um número: ");
        num = ler.nextFloat();

        if(num>=100 && num<=200) {
            System.out.println("O seu número está entre 100 e 200");
        }
        else {
            System.out.println("O seu número está fora de 100 e 200");
        }
    }
}