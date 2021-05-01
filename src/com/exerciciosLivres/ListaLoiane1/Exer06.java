package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
public class Exer06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o Raio de um circulo: ");
        double raio = scan.nextDouble();

        //PI 3.14 (Math.Pi) raio*raio (Math.pow)
        double area = Math.PI  * Math.pow(raio, 2);
        System.out.println("A area de um circulo é: " + area + " cm.");
    }
}
