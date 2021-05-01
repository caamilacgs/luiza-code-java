package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

//10.Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

public class Exer10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = ((celsius * 1.8) + 32.0);
        System.out.printf("\nTemperatura em Celsius: %.2f %n" , celsius);
        System.out.printf("Temperatura em Forenheint: %.2f %n" , fahrenheit);

    }
}
