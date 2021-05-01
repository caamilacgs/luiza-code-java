package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

//11.Faça um Programa que peça 2 números inteiros e um número real.
// Calcule e mostre: a. o produto do dobro do primeiro com metade do segundo
// . b. a soma do triplo do primeiro com o terceiro. c. o terceiro elevado ao cubo.
public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num1 = scan.nextInt();

        System.out.print("Digite um segundo numero: ");
        int num2 = scan.nextInt();

        System.out.print("Digite um numero real: ");
        double num3 = scan.nextDouble();

        int resultado1 = ((num1 * 2)+ (num2 /2));
        double resultado2 = ((num1 * 3) + num3);
        double resultado3 = Math.pow (num3 , 3);

        System.out.println("Resultado1: " + resultado1);
        System.out.println("Resultado2: " + resultado2);
        System.out.println("Resultado3: " + resultado3);
    }
}
