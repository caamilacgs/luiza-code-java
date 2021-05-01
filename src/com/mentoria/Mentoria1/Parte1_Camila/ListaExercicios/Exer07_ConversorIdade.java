package com.luizacode.aula05_Sabado.Parte1_Camila.ListaExercicios;

import java.util.Scanner;

public class Exer07_ConversorIdade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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
