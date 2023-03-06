package condicionais;

public class Repeticao {
    public static void main(String[] args) {
        for(int i = 0;i < 5;i++){
            System.out.println("Valor de i "+ i);
        }

        int j = 0;
        while (j < 5){
            System.out.println("Valor de j: "+j);
            j++;
        }

        int k = 0;
        do{
            System.out.println("Valor de k: "+k);
            k++;
        }while (k<5);

        for (int i = 0;i<10;i++){
            if(i == 5){
                break;
            }
            System.out.println("Valor de i: "+i);
        }

        for(int i = 0;i <10;i++){
            if(i == 5){
                continue;
            }
            System.out.println("Valor de i: "+i);
        }



    }
}
