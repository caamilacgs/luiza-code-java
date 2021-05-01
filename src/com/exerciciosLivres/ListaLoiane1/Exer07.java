package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

//7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

public class Exer07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double lado = scan.nextDouble();

        double area = Math.pow (lado, 2);
        double perimetro = lado *4;
        //double area = lado * lado;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
