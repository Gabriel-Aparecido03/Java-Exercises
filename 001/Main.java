import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner read;
    String name;

    System.out.print("Insira seu nome ");
    read = new Scanner(System.in);

    name = read.nextLine();

    System.out.println("O seu nome é: "+name);
  }
}