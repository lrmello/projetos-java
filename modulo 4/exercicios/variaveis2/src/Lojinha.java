import java.util.Locale;
import java.util.Scanner;
public class Lojinha {

    static double calculaValorEstoque(int quantidade, double preco){
        return quantidade * preco;
    }

    static void apresentarBoasVindas(){

    }
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);
        int quantidade1,quantidade2;

        System.out.print("Digite o quantidade 1: ");
        quantidade1 = teclado.nextInt();
        //breakpoints: Ponto de quebra

        System.out.print("Digite o quantidade 2: ");
        quantidade2 = teclado.nextInt();

        double preco1,preco2;

        System.out.print("Digite o preço 1: ");
        preco1 = teclado.nextDouble();

        System.out.print("Digite o preço 2: ");
        preco2 = teclado.nextDouble();

        double valorEmEstoque1 = calculaValorEstoque(quantidade1,quantidade2);
        double valorEmEstoque2 = calculaValorEstoque(quantidade1,quantidade2);
        double valorTotal = valorEmEstoque1 + valorEmEstoque2;

        double valorMedio = valorTotal / 2;

        System.out.println("Valor total (primeiro): R$%.2f\n "+ valorEmEstoque1);
        System.out.println("Valor total (Segundo): R$%.2f\n "+ valorEmEstoque2);
        System.out.println("Valor total (Médio): R$%.2f\n "+ valorMedio);
    }


}