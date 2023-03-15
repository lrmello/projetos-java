package model.interfaces;

public interface FiguraPlana {

    double area();
    double perimetro();

    default double teste(){
        System.out.println("Hello!");
    }

}
