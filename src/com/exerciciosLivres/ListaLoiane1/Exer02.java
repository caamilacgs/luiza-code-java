package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
public class Exer02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = scan.nextInt();
        System.out.println("O numero informado foi: " + numero);
    }
}
