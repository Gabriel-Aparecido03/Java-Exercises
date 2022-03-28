import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner ler;
        float num;

        ler = new Scanner(System.in);

        System.out.println("Coloque um número: ");
        num = ler.nextFloat();

        if (num<3 || num >25) {
            System.out.println("O seu número está entre 4 a 24.");
        }
        else {
            System.out.println("Seu número está fora de 4 a 24.");
        }
    }
}