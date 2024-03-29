package model;

import model.enums.Cor;

public class Retangulo extends FiguraPlana {

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
