package com.exerciciosLivres.ExerciciosJavaBasico;

//Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//(1SM=R$788,00)
import java.util.Scanner;

public class Exer5_SalarioMinino {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-----------Salario Minino------------");

        System.out.println("Digite o saldo: ");
        float salario = input.nextFloat();

        float salarioMinino = 788;

        float x =  salario / salarioMinino;

        System.out.printf("Quantidade de salario que ganha é: %.1f " , x);

    }

}
