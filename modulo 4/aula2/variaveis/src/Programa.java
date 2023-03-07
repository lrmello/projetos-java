import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        long tempo = 10;
        short dias = 7;
        double peso = 76.800;
        char confirma = 's';

        System.out.println(confirma);

        int confirmaNumerico = confirma;

        int caixaDeSapato = 3;
        var carro = (long)1;

        carro = caixaDeSapato;

        Scanner teclado = new Scanner(System.in);

        System.out.println(confirmaNumerico);

        //Casting: aviso de troca
        System.out.println((int)confirma);
        //buffer:fila de espera- FIFO:first in first out
        //stacktrace: pilha rastro
        // pilha: LIFO: last in first out
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

        double valorEmEstoque1 = preco1 * quantidade1;
        double valorEmEstoque2 = preco2 * quantidade2;
        double valorTotal = valorEmEstoque1 + valorEmEstoque2;

        double valorMedio = valorTotal / 2;

        System.out.println("Valor total (primeiro): R$%.2f\n "+ valorEmEstoque1);
        System.out.println("Valor total (Segundo): R$%.2f\n "+ valorEmEstoque2);
        System.out.println("Valor total (Médio): R$%.2f\n "+ valorMedio);



    }
}