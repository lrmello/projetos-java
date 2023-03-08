import java.util.Scanner;

public class ChuvaCarioca {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Está chovendo?");

        String respostaDaPergunta = leitor.nextLine();
        //boolean estaChovendo = respostaDaPergunta == "sim" ? true : false;
        boolean estaChovendo = respostaDaPergunta.equals("sim");
        //equalsIgnoreCase: ignora maiusculas e minusculas

        if(estaChovendo){
            System.out.println("Devo ficar em casa e desligar a tv");
        }else{
            System.out.println("Vou sair de casa");
        }

    }
}
