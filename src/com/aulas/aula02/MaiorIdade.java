package com.aulas.aula02;

import java.util.Scanner; //biblioteca importando o scanner

public class MaiorIdade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");
        int idade = input.nextInt(); //declaração da variavel

        boolean  eMaiorDe18 = idade > 18;

        if(idade >=  18){
            System.out.println("Bem vindo ao nosso site!");
        }else{
            System.out.println("Você não pode acessar o site!");
        }

    }
}
