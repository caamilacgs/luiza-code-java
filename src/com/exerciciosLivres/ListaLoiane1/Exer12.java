package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

//12.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
// calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) -58;

        System.out.println("O peso ideal: " + pesoIdeal);
    }
}
