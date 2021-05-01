package com.luizacode.aula05_Sabado.Parte1_Camila.ListaExercicios;

import java.util.Scanner;

public class Exer06_Triangulo {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Dimensões de um Triangulo");
        System.out.println("======================================");

        float base, altura, area;

        System.out.println("Digite a base:");
        base = input.nextInt();

        System.out.println("Digite a altura:");
        altura = input.nextInt();

        area = (base * altura)/2;

        System.out.println("Area do Triangulo é: "+ area);
    }
}
