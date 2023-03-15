package com.raiadrogasil.calculadora;

import com.raiadrogasil.calculadora.util.Calculadora;

public class Main {
    public static void main(String[] args) {
        var resultado = Calculadora.dividir(2, 0);

        System.out.println(resultado);
    }
}