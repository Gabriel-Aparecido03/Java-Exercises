import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        float nota1,nota2,nota3,nota4,media;
        int pesoNota1,pesoNota2,pesoNota3,pesoNota4;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        nota1 = ler.nextFloat();

        System.out.println("Qual o peso dessa nota");
        pesoNota1 = ler.nextInt();
 
        System.out.print("Insira a primeira nota: ");
        nota2 = ler.nextFloat();

        System.out.println("Qual o peso dessa nota");
        pesoNota2 = ler.nextInt();

        System.out.print("Insira a primeira nota: ");
        nota3 = ler.nextFloat();

        System.out.println("Qual o peso dessa nota");
        pesoNota3 = ler.nextInt();

        System.out.print("Insira a primeira nota: ");
        nota4 = ler.nextFloat();

        System.out.println("Qual o peso dessa nota");
        pesoNota4 = ler.nextInt();

        if((nota1 > 10 || nota1 < 0) || (nota2 > 10 || nota2< 0)  || (nota3 > 10 || nota3 < 0) || (nota4 > 10 || nota4 < 0)) {
            System.out.println("Notas inválidas");
        }

       else {
            media = (nota1*pesoNota1 + nota2*pesoNota2 + nota3*pesoNota3 + nota4*pesoNota4)/pesoNota1 + pesoNota2 + pesoNota3 + pesoNota4;
            
            System.out.println("A sua média foi "+media);

            if(media >= 7) {
                System.out.println("ALUNO APROVADO");
            }
            else if (media <= 5 || media <7) {
                System.out.println("ALUNO DE EXAME FINAL");
            }
            else {
                System.out.println("ALUNO REPROVADO");
            }
       }
    }
}