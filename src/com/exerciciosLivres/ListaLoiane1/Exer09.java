package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

// 9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
// o C = (5 * (F-32) / 9).
public class Exer09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Farenheit: ");
        float fahrenheit = scan.nextFloat();

        float celsius = (5 *(fahrenheit-32) / 9);
        System.out.println("\nTemperatura em Forenheint: " + fahrenheit);
        System.out.printf("Temperatura em Celsius: %.2f %n" , celsius);
    }
}
