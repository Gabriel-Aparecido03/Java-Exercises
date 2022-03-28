import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int insertedNum;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.println("Insira um número: ");
        insertedNum = ler.nextInt();

        if(insertedNum % 2 == 0) {
            System.out.println("O número é par.");
        }
        else {
            System.out.println("O número é ímpar.");
        }
    }
}