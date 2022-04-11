import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        float nota1,nota2,nota3,nota4,media;
        int falta1,falta2,falta3,falta4,faltas;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.println("Nota primeiro bimestre: ");
        nota1 = ler.nextFloat();
        System.out.println("Faltas primeiro bimestre: ");
        falta1 = ler.nextInt();

        System.out.println("Nota secondo bimestre: ");
        nota2 = ler.nextFloat();
        System.out.println("Faltas secondo bimestre: ");
        falta2 = ler.nextInt();
    
        System.out.println("Nota terceiro bimestre: ");
        nota3 = ler.nextFloat();
        System.out.println("Faltas terceiro bimestre: ");
        falta3 = ler.nextInt();

        System.out.println("Nota quarto bimestre: ");
        nota4 = ler.nextFloat();
        System.out.println("Faltas quarto bimestre: ");
        falta4 = ler.nextInt();

        media = (nota1+nota2+nota3+nota4)/4;
        faltas = falta1+falta2+falta3+falta4;


        if(media >= 7 && faltas <= 36) {
            System.out.println("APROVADO");
        }
        else if(media >= 4 && faltas <= 36) {
            System.out.println("EXAME FINAL");
        }
        else {
            System.out.println("REPROVADO");
        }
    }
}