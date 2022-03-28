import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner ler;
        int sal = 1000;
        float kw;

        ler = new Scanner(System.in);

        System.out.println("Insira o Kwts da sua conta de luz: ");
        kw = ler.nextFloat();

        System.out.println(kw - kw*0.1);
    }
}