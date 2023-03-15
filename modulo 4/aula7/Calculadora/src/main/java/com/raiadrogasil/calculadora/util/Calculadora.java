package com.raiadrogasil.calculadora.util;

public class Calculadora {

    public static double dividir (int a, int b){
        int resultado;
        try {
            resultado = a / b;
            return resultado;
        }catch (ArithmeticException e){
            System.out.println("Erro na divisão");
            System.out.println("Motivo: "+ e.getMessage());
            return  -1;
        }
    }

}
