import java.util.Scanner;

class Main {
    public static void main(String[] args){
        float prod1,prod2,soma;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.print("Coloque o primeiro preço: ");
        prod1 = ler.nextFloat();

        System.out.print("Coloque o segundo preço: ");
        prod2 = ler.nextFloat();

        soma = prod1 +prod2;

        System.out.println("Soma do produtos foi :"+soma);
    }
}