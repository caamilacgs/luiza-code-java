package com.aulas.aula02;

import java.util.Scanner; //biblioteca importando o scanner

public class Calculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;
        int subtracao;
        int divisao;
        int resto;

        System.out.println("Entre com o primeiro número: ");
        numero1 = input.nextInt();

//        if(numero1 >= && numero1 <=100)

        System.out.println("Entre com o segundo número: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        divisao = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("A soma dos números: " + soma);
        System.out.println("A subtração dos números: " + subtracao);
        System.out.println("A divisao dos números: " + divisao);
        System.out.println("O resto da divisao dos números: " + resto);

    }
}
