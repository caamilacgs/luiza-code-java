package com.exerciciosLivres.ExerciciosJavaBasico;

import java.util.Scanner;

//Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//números 4, 5 e 6. A soma das duas médias. A média das médias

public class Exer2_MediaAritmetica {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("---------Media Aritmetica---------");

        float a = (8+9+7)/3;
        float b = (4+5+6)/3;
        float c = (a+b);
        float d = (a+b)/2;

        System.out.println("A media dos numeros 8,9 e 7 é: " + a);
        System.out.println("A media dos numeros 4,5 e 6 é: " + b);
        System.out.println("A soma das duas medias é: " + c);
        System.out.println("A media sumprema é: " + d);
    }

}