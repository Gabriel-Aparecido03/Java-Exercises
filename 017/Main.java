import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int quantidadeMoedas1Real,quantidadeMoedas50Cent,quantidadeMoedas25Cent,quantidadeMoedas10Cent,quantidadeMoedas5Cent,quantidadeMoedas1Cent;
        float precoProduto,totalValorPorquinho;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.print("Qual o valor do produtos: ");
        precoProduto = ler.nextFloat();
       
        System.out.println("Quantas moedas de 1 Real,há no cofre: ");
        quantidadeMoedas1Real = ler.nextInt();

        System.out.println("Quantas moedas de 50 centavos,há no cofre: ");
        quantidadeMoedas50Cent = ler.nextInt();

        System.out.println("Quantas moedas de 25 centavos,há no cofre: ");
        quantidadeMoedas25Cent = ler.nextInt();

        System.out.println("Quantas moedas de 10 centavos,há no cofre: ");
        quantidadeMoedas10Cent = ler.nextInt();

        System.out.println("Quantas moedas de 5 centavos,há no cofre: ");
        quantidadeMoedas5Cent = ler.nextInt();

        System.out.println("Quantas moedas de 1 centavo,há no cofre: ");
        quantidadeMoedas1Cent = ler.nextInt();

        totalValorPorquinho = quantidadeMoedas1Real*1 + quantidadeMoedas50Cent*.5f + quantidadeMoedas25Cent*.25f + quantidadeMoedas10Cent*.1f + quantidadeMoedas5Cent*.5f + quantidadeMoedas1Cent*.01f;

        if(totalValorPorquinho > precoProduto) {
            System.out.println("CONSEGUI COMPRAR");
        }
        else {
            System.out.println("INFELIZMENTE NÃO CONSEGUI COMPRAR");
        }
    }
}