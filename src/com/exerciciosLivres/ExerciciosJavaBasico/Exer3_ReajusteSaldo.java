package com.exerciciosLivres.ExerciciosJavaBasico;

//Informar um saldo e imprimir o saldo com reajuste de 1%.

import java.util.Scanner;

public class Exer3_ReajusteSaldo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-----------Reajuste Saldo------------");

        System.out.println("Digite o saldo: ");
        float saldo = input.nextFloat();

        System.out.println("O Saldo com reajuste de 1% é: " + (saldo * 1.01));

    }

}
