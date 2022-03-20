import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char letter;
        Scanner read;

        System.out.print("Coloque qualquer letra do alfabeto: ");
        read = new Scanner(System.in);
        letter = read.next().charAt(0);

        System.out.println("Você colocou a letra: "+letter);
    } 
}
