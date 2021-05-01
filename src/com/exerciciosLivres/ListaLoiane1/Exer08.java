package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

// 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.
public class Exer08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor ganho por hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHora * horasTrabalhadas;
        System.out.println("O salario referente ao mês é: " + salario);
    }
}
