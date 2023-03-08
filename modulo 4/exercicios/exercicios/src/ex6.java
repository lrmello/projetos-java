import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num =sc.nextLine();

        int resultado = 0;

        if(parseInt(num) <=1000 && parseInt(num) >= 0){
            for (int i = 0; i < num.length();i++){
                System.out.println(num.charAt(i));
                resultado += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            System.out.println(resultado);
        }else{
            System.out.println("Está errado idiota");
        }
    }
}
