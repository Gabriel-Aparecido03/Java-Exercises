import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        float nota1,nota2,nota3,nota4,media;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.print("Coloque a primeira nota: ");
        nota1 = ler.nextFloat();

        System.out.print("Coloque a segunda nota: ");
        nota2 = ler.nextFloat();

        System.out.print("Coloque a terceira nota: ");
        nota3 = ler.nextFloat();

        System.out.print("Coloque a quarta nota: ");
        nota4 = ler.nextFloat();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A sua média foi: "+media);
    }
}