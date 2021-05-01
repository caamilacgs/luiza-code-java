package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

//5. Faça um Programa que converta metros para centímetros.
public class Exer05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a metragem: ");
        double metro = scan.nextDouble();

        double convertido = metro * 100;
        System.out.println("\nMetros: " + metro);
        System.out.println("Convertido em Centimetros: " + convertido + " cm.");
    }
}
