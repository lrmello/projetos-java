package model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private double imposto;

    private double salarioLiquido;

    public Funcionario(double imposto, double salarioLiquido) {
        this.imposto = imposto;
        this.salarioLiquido = salarioLiquido;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        imposto = imposto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido - imposto;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getTotalDasVendas(){
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>(lista1);
        List<Integer> lista3 = lista1;

        Calculadora.somar(vendas.stream().toArray());
    }
}
