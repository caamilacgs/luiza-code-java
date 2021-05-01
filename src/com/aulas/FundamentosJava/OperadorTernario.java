package com.aulas.FundamentosJava;

public class OperadorTernario {

    public static void main(String[] args){
        System.out.println("==========================");
        System.out.println("Operador Ternario");
        System.out.println("==========================");
        int valor = 5;

        String resultado = (5 % 2 == 0) ? "O numero é par" : "O numero é impar";
        System.out.println(resultado);

        //COM USO DO IF
        if (valor % 2 == 0){
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
        }
    }
}
