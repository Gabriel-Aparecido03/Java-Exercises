import java.util.Scanner;

class Main {
    public static void main(String[] args){
        float celsius,fahr;   
        Scanner ler;

        ler = new Scanner(System.in);
        
        System.out.print("Coloque a temperatura em Celsius: ");
        celsius = ler.nextFloat();

        fahr = (celsius * 9/5) + 32;

        System.out.println("A tempatura em Fahrenheit foi: "+fahr);
    }
}