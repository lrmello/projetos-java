import java.util.Scanner;

public class exExtra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia,mes,ano;
        boolean bi = false;
        System.out.println("Informe o dia: ");
        dia = sc.nextInt();
        System.out.println("Informe o mes: ");
        mes = sc.nextInt();
        System.out.println("Informe o ano");
        ano = sc.nextInt();

        if (ano % 400 == 0){
            bi = true;
        } else if((ano % 4 == 0) && (ano % 100 != 0)) {
            bi = true;
        }

        if(dia > 0 && dia <= 31){
            if(mes <=12 && mes > 0){
                if(bi){
                    System.out.println();
                }
            }
        }
    }
}
