import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int doubleNum;
        Scanner read;

        System.out.print("Coloque seu número: ");

        read = new Scanner(System.in);
        doubleNum = read.nextInt();

        System.out.println("O dobro do súmero é: "+ doubleNum * 2);
    }
}
