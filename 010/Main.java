import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String nome;
        Float idade,peso,altura;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.print("Coloque seu nome: ");
        nome = ler.nextLine() ;

        System.out.print("Coloque sua idade: ");
        idade = ler.nextFloat();

        System.out.print("Coloque sua altura: ");
        altura = ler.nextFloat();

        System.out.print("Coloque seu peso");
        peso = ler.nextFloat();

        System.out.println("O seu nome é : "+nome+",a sua idade é :"+idade+",a sua altura é :"+altura+",o seu peso é: "+peso);
    }
}