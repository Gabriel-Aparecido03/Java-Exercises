import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner ler;
        float nota1,nota2,nota3,nota4,media;

        ler = new Scanner(System.in);
        
        System.out.println("Insira a primeira nota: ");
        nota1 = ler.nextFloat();

        System.out.println("Insira a primeira nota: ");
        nota2 = ler.nextFloat();
            
        System.out.println("Insira a primeira nota: ");
        nota3 = ler.nextFloat();

        System.out.println("Insira a primeira nota: ");
        nota4 = ler.nextFloat();

        if((nota1 > 10 || nota1 < 0) || (nota2 > 10 || nota2< 0)  || (nota3 > 10 || nota3 < 0) || (nota4 > 10 || nota4 < 0)) {
            System.out.println("Notas inválidas");
        }

        else {
            media = (nota1+nota2+nota3+nota4)/4;
            System.out.println("A sua média foi: "+media);
            if (media >=7) {
                System.out.println("ALUNO APROVADO  ");
            }
            else if (media >=5 && media <7) {
                System.out.println("ALUNO DE EXAME FINAL");
            }
            else {
                System.out.println("ALUNO REPROVADO");
        }
        }
    }
}