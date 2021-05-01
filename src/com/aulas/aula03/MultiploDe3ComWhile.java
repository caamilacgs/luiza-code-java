package com.aulas.aula03;

import java.util.Scanner;

public class MultiploDe3ComWhile {

    public static void main(String[] args){

        int contador = 1;

        while (contador <= 100){
            if(contador % 3 == 0){
                System.out.println(contador);
            }
            contador ++;
        }
    }
}