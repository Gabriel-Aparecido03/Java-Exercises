import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        float nota1,nota2,nota3,nota4,media;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        nota1 = ler.nextFloat();

        System.out.println("Informe a segunda nota: ");
        nota2 = ler.nextFloat();

        System.out.println("Informe a terceira nota: ");
        nota3 = ler.nextFloat();

        System.out.println("Informe a quarta nota: ");
        nota4 = ler.nextFloat();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("Sua média foi de : "+media);
        if(media>=7) {
            System.out.println("ALUNO APROVADO");
        }
        else if(media>=5 && media <=5) {
            System.out.println("ALUNO DE EXAME FINAL");
        }
        else {
            System.out.println("ALUNO REPROVADO");
        }
    }
}