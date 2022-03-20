import java.util.Scanner;

class Main {
    public static  void main(String[] args) {
        Scanner ler;
        Float area,height,width;

        ler = new Scanner(System.in);

        System.out.print("Informe a altura do retângulo: ");
        height = ler.nextFloat();

        System.out.print("Informe a largura do retângulo: ");
        width = ler.nextFloat();

        area = height * width;

        System.out.println("A área do retângulo é : "+area);
    }   
}