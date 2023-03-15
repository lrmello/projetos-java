package model;

public class Circulo implements Comparable {

    public static final double PI = 3.14;

    public void setRaio(double raio){

        this.raio = raio;
    }

    @Override
    public double area(){
        return 0;
    }

    @Override
    public double perimetro(){
        return 2 * PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio" + raio +
                ", Cor=" +cor+
                "qntdDelLados = " + qntdDeLados+
                "}" ;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
