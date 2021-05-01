package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

import java.util.Scanner;

//13.Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê: . salário bruto. a. quanto pagou ao INSS. b. quanto pagou ao sindicato. c. o salário líquido. d. calcule os descontos e o salário líquido, conforme a tabela abaixo: + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
//2.     Obs.: Salário Bruto - Descontos = Salário Líquido.
public class Exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor ganho por hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100 * 5);
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O salario bruto é: " + salarioBruto);
        System.out.println("O valor do INSS: " + inss);
        System.out.println("O valor pago ao sindicato: " + sindicato);
        System.out.println("O valor do Imposto de Renda: " + ir);
        System.out.println("O valor total dos descontos: " + totalDescontos);
        System.out.println("\nO salario Liquido: " + salarioLiquido);
    }
}
