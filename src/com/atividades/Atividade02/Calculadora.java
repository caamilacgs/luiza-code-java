package com.atividades.Atividade02;

import java.util.Scanner;

public class Calculadora {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("         CALCULADORA");
        System.out.println("===============================");

        //Variaveis
        int numero1, numero2;
        int soma;
        int subtracao;
        int divisao;
        int resto;

        //Entrada
        System.out.print("Entre com o primeiro número: ");
        numero1 = input.nextInt();
        System.out.print("Entre com o segundo número: ");
        numero2 = input.nextInt();

        //Processamento
        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        divisao = numero1 / numero2;
        resto = numero1 % numero2;

        //Saida
        System.out.println("\nA soma dos números: " + soma);
        System.out.println("A subtração dos números: " + subtracao);
        System.out.println("A divisao dos números: " + divisao);
        System.out.println("O resto da divisao dos números: " + resto);

    }
}
