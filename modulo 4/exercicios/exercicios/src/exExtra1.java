import java.util.Scanner;

public class exExtra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a + b > c && b + c >b && c + b > a){
            System.out.println("Da pra fazer um  triangulo");
        }else{
            System.out.println("Não da pra fazer um triangulo");
        }
    }

}
