import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner ler;
        int sal = 1000;
        float kw,base,kwExponencial,price;

        ler = new Scanner(System.in);

        System.out.println("Insira o Kwts da sua conta de luz: ");
        kw = ler.nextFloat();

        base = sal/7;
        kwExponencial = kw/100;

        price = (kwExponencial * base) * 0.9;

        System.out.println("A sua conta ficou em : "+price);
    }
}