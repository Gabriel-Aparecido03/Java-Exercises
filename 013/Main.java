import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        float nota1,nota2,nota3,media;
        
        Scanner ler;
        ler = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        nota1 = ler.nextFloat();

        System.out.println("Informe a segunda nota: ");
        nota2 = ler.nextFloat();

        System.out.println("Informe a terceira nota: ");
        nota3 = ler.nextFloat();

        media = (nota1 + nota2 +nota3)/3;

        System.out.println("A sua nota foi de : "+media);
        if(media >= 7 ) {
            System.out.println("Parabéns,você foi aprovado.");
        }
        else {
            System.out.println("Infelizmente,você foi reprovado");
        }
    }
}