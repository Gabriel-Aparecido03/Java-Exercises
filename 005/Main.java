import java.util.Scanner;

class Main {
    public static void main(String[] args){
        int num,ant,suc;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.print("Coloque um número: ");
        num = ler.nextInt();

        ant = num - 1;
        suc = num + 1;

        System.out.print("O número foi "+ num + ",o seu sucessor é "+suc+", o seu antecessor é "+ant);
    }   
}