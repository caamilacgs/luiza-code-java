package com.mentoria.Mentoria1.Parte2_Mariana;

public class OperadoresComparacao {

    public static void main(String[] args){

        int valorA = 1;
        int valorB = 2;

        if (valorA > valorB) {
            System.out.println("maior: Utilizado quando desejamos verificar se uma variável é maior que outra.");
        }
        if (valorA >= valorB) {
            System.out.println("maior ou igual: Utilizado quando desejamos verificar se uma variável é maior ou igual a outra");
        }
        if (valorA < valorB) {
            System.out.println("menor: Utilizado quando desejamos verificar se uma variável é menor que outra.");
        }
        if (valorA <= valorB) {
            System.out.println("menor ou igual: Utilizado quando desejamos verificar se uma variável é menor ou igual a outra.");
        }
        if(valorA == valorB){
            System.out.println("Valores iguais : Utilizado quando desejamos verificar se uma variável é igual a outra.");
        }
        if(valorA != valorB){
            System.out.println("Valores diferentes: Utilizado quando desejamos verificar se uma variável é diferente de outra.");
        }
        else {
            System.out.println("Valores diferentes");
        }
//
        }
}
