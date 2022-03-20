import java.util.Scanner;

class Main {
    public static void main(String args[]){
        int num1,num2,soma,diferenca,mult;
        float div;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        num1 = ler.nextInt();

        System.out.print("Informe o secundo número: ");
        num2 = ler.nextInt();

        soma = num1 + num2;
        diferenca = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("A soma dos números é: "+soma);
        System.out.println("A difrenca é: "+diferenca);
        System.out.println("A multiplacao é :"+mult);
        System.out.println("A divisao é: "+div);
    }
}