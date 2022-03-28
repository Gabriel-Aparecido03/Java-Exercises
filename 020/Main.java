import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        float num1,num2,num3;
        float maior;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();
        maior = num1;

        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();

        if(num2 > maior) {
            maior = num2;
        }

        System.out.println("Digite o terceiro número: ");
        num3 = ler.nextInt();
        if(num3 > maior) {
            maior = num3;
        }
        
        System.out.println("O maior número é: "+maior);
    }
}