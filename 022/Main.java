import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        float sal,prest,val,valPrest,porc;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.println("Insira o seu salário: ");
        sal = ler.nextFloat();

        System.out.println("Insira o valor do empréstimo: ");
        val = ler.nextFloat();

        System.out.println("Insira quantas prestações: ");
        prest = ler.nextFloat();

        valPrest = val/prest;

        porc = .3f*sal;
        if(valPrest > porc) {
            System.out.println("EMPRÉSTIMO REJEITADO.");
        }
        else {
            System.out.println("EMPRÉSTIMO ACEITO.");
        }
    }
}