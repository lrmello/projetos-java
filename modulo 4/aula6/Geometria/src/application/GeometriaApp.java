package application;

import model.FiguraPlana;
import model.Retangulo;
import model.enums.Cor;

import java.util.ArrayList;
import java.util.List;

public class GeometriaApp {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(Cor.PRETO,5);

        /*Upcasting*/
        FiguraPlana figura1 = new Retangulo(Cor.BRANCO,7,5.5,5);

        List<Retangulo> retangulos = new ArrayList<>();
        /*Começa vazia
        * Não tem quantidade fixa de elementos
        * tem métodos
        * */

        retangulos.add(retangulo);
        retangulos.add(new Retangulo(Cor.BRANCO,8.3));
        retangulos.remove(retangulo);
        retangulos.get(0);

        for(int i = 0;i < retangulos.size();i++){
            System.out.println(retangulos.get(i) + "");
        }

        Object o;

        retangulos.forEach(e -> System.out.println(e + ""));
        retangulos.stream().filter(r ->r.getAltura()>2.0).map(r->r.getCor()).toList();

    }
}
