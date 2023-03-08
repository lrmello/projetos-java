import java.util.Scanner;

public class exExtra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano = sc.nextInt();

        anobissexto(ano);
    }

    public static void anobissexto(int ano){
        if (ano % 400 == 0){
            System.out.println("É bissexto");
        } else if(ano % 4 == 0 && ano % 100 != 0) {
            System.out.println("É bissexto");
        }else{
            System.out.println("Não é bissexto");
        }
    }
}
