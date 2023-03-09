import java.util.Scanner;

public class Saque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu saldo atual: ");
        double saldoAtual=input.nextDouble();

        input.nextLine();

        System.out.println("Digite o valor a sacar: ");
        double valorSaque=input.nextDouble();

        double valorAtual=input.nextDouble();

        while (saldoAtual >= valorSaque){
            if(valorSaque > saldoAtual){
                System.out.println("Saldo insuficente...Seu saldo"+saldoAtual);
            }else{
                System.out.println("Valor sacado como sucesso"+valorSaque);
                valorSaque-=valorAtual;
            }
        }

        System.out.println("Obrigado");
    }
}
