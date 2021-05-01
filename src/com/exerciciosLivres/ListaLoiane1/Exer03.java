package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

//3. Faça um Programa que peça dois números e imprima a soma.
public class Exer03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o numero inteiro: ");
        double num1 = scan.nextDouble();

        System.out.print("Digite o segundo inteiro: ");
        double num2 = scan.nextDouble();

        double soma = num1 + num2;
        System.out.println("A soma dos numeros é: " + soma);
    }
}

