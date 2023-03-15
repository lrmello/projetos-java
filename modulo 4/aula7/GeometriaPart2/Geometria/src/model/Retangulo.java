package Geometria.src.model;


import Geometria.src.model.enums.Cor;
import model.interfaces.FiguraPlana;

public class Retangulo extends Geometria.src.model.FiguraPlanaAbstrata {

    private double base;

    private double altura;

    public Retangulo(Cor cor, double lado) {
        super(cor);
        this.qntdDeLados = 4;
        this.base = lado;
        this.altura = lado;
    }

    public Retangulo(Cor cor, double lado, double base, double altura) {
        super(cor);
        this.qntdDeLados = 4;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    public double perimetro(){
        return 2 * (base * altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
