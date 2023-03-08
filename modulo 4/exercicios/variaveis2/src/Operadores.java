import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        //        if braceless = se sem chaves
//        funciona apenas se tem um comando dentro do bloco
/*        if(respostaDaPergunta == "Sim" )
            estaChovendo = true;
        else
            estaChovendo = false;*/

        /*Operador binário = 2 + 2
         * Operador unário = a++ incremento, a-- decremento*/

        int a = 2;
        a++;
        System.out.println(a);

        //Operador ternário
        Scanner leitura = new Scanner(System.in);
        int idade = leitura.nextInt();

        String texto = (idade>= 13) ? "Ah blz": "ñ pode";
        System.out.println(texto);
    }
}
