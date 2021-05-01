package com.luizacode.aula05_Sabado.Parte1_Camila.ListaExercicios;

//Uma revendedora de carros usados paga aos seus funcionários vendedores, um salário fixo
//por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das
//vendas por ele efetuadas. Faça um algoritmo que lê o número do vendedor, o número de
//carro vendido e calcula o salário mensal do vendedor, escrevendo-o juntamente com o seu
//número de identificação.

import java.util.Scanner;

public class Exer11_FabricaCarros {

    public static void main(String[] args) {
    	
        System.out.println("Fabrica de Carros");

        String vendedor;
        int carrosVendidos, totalVendas, salarioFixo, bonusCarro;
        float salario;

        Scanner input = new Scanner(System.in);
        	
			System.out.print("Digite o nome Vendedor: ");
			vendedor = input.next();

			System.out.print("Digite o valor de Carros Vendidos: ");
			carrosVendidos = input.nextInt();

			System.out.print("Digite o valor de Total de Vendas: ");
			totalVendas = input.nextInt();

			System.out.print("Digite o valor de Salario Fixo: ");
			salarioFixo = input.nextInt();

			System.out.print("Digite o valor de Bonus Carro: ");
			bonusCarro = input.nextInt();
			
			salario = (int) (salarioFixo + (bonusCarro * carrosVendidos) + (0.05 * totalVendas));
			
			System.out.println("Vendedor: \t" + vendedor);
			System.out.println("Salario: \t"+ salario);
    }
}
