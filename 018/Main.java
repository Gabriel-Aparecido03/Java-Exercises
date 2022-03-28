import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int userChose;
        float handleTemp,tempTransformed;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("Coloque o número da sua escolha");
        userChose = ler.nextInt();

        if(userChose ==1 ) {
            System.out.println("Informe a temperatura em Celsius");
            handleTemp = ler.nextFloat();

            tempTransformed = handleTemp*1.8f + 32;
            System.out.println("A temparatura inserida foi de "+handleTemp+" Celsius e em Fahrenheit foi de : "+tempTransformed);
        }
        else {  
            System.out.println("Informe a temparatura em Fahrenheit");
            handleTemp = ler.nextFloat();

            tempTransformed = (handleTemp-32)/1.8f;
            System.out.println("A temparatura inserida foi de "+handleTemp+" Fahrenheit e em Celsius foi de : "+tempTransformed);
        }
    }
}