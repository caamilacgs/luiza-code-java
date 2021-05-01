package com.aulas.FundamentosJava;

public class EstruturaSequencia {

    public static void main(String[] args) {

        String nome = "A";

        switch (nome){
            case "A":
                System.out.println("Arara");
                break;
            case "B":
                System.out.println("Boto");
                break;
            case "C":
                System.out.println("Cachorro");
                break;
            default:
                System.out.println("Não Cadastrada!");
        }
    }
}
