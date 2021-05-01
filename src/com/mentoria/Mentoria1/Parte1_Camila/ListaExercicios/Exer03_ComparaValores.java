package com.luizacode.aula05_Sabado.Parte1_Camila.ListaExercicios;

public class Exer03_ComparaValores {

    public static void main (String[] args){

        System.out.println("=======================");
        System.out.println("Comparação de valores");
        System.out.println("=======================");

    float a = (4/2)+(2/4);
    float x = 4/2+2/4;
    float b = 4/(2+2)/4;
    float y = 4/2+2/4;
    float c = (4+2)*2-4;
    float z = 4+2*2-4;


        System.out.println("\nProduzem o mesmo resultado?");

        System.out.println("\nA: "+ "| 1- " + a + " | 2- " + x);
        if(a == x){
            System.out.println(" -> Resultado é igual!");
        } else{
            System.out.println(" -> Resultado é diferente, porque os parênteses mudam a ordem de leitura.");
        }
        System.out.println("\nB: "+ "| 1- " + b + " | 2- " + y);
        if(b == y){
            System.out.println(" -> Resultado é igual!");
        }else{
            System.out.println(" -> Resultado é diferente, porque os parênteses mudam a ordem de leitura.");
        }
        System.out.println("\nC: "+ "| 1- " + c + " | 2- " + z);
        if(c == z){
            System.out.println(" -> Resultado é igual!");
        }else{
            System.out.println(" -> Resultado é diferente, porque os parênteses mudam a ordem de leitura.");
        }
    }
}
