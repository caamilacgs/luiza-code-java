package com.exerciciosLivres.ExerciciosJavaBasico;

//Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
//antecessor e seu sucessor.

import java.util.Scanner;

public class Exer6_AntecessorSucessor {

    public static void main (String[] args){
        System.out.println("======================================");
        System.out.println("Mostrar o numero Antecessor e Sucessor");
        System.out.println("======================================");

        int num = 0;
        int antecessor = 0;
        int sucessor = 0;

        System.out.println("Digite um Numero:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        antecessor = num -1;
        sucessor = num +1;

        System.out.printf("O antecessor de %d é %d.", num, antecessor);
        System.out.printf("\nO sucessor de %d é %d.", num, sucessor);
    }
}
