package com.exerciciosLivres.ExerciciosJavaBasico;

//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

import java.util.Scanner; //biblioteca importando o scanner

public class Exer1_ConversorIdade {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Conversor de Idade em dias");

        System.out.println("Digite um ano: ");
        int ano = input.nextInt();

        System.out.println("Digite o mes: ");
        int mes = input.nextInt();

        System.out.println("Digite o dia: ");
        int dia = input.nextInt();

        int x = (dia+(ano*365)+(mes*30));


        System.out.printf("Idade correesponde em dias á: " + x );

    }
}
