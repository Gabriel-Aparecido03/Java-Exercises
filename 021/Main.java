import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        float num1,num2,operation,sum;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        num1 = ler.nextFloat();

        System.out.println("Informe o segundo número: ");
        num2 = ler.nextFloat();

        sum = num1+num2;

        if(sum >20) {
            System.out.println(sum+8);
        }
        else {
            System.out.println(sum-5);
        }
    }
}