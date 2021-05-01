package com.aulas.aula02;

//OBSERVAÇÕES
// Para inserir a entrada precisa digitar o numero com virgula exemplo: 9,2 8,1 7.3


import java.util.Scanner;

public class AprovadoReprovado {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //entrada
        System.out.println("Informe a nota 1: ");
        float nota1 = input.nextFloat();

        System.out.println("Informe a nota 2: ");
        float nota2 = input.nextFloat();

        System.out.println("Informe a nota 3: ");
        float nota3 = input.nextFloat();
        System.out.println("Informe o numero de faltas: ");
        int faltas = input.nextInt(); // recebe falta

        //processamento
        float media = (nota1+nota2+nota3)/ 3;

        //Saida
        if (media >= 7.0 ){
            if (faltas >= (68*0.25)){ //compara a falta com o percentual
                System.out.println("Reprovado por falta" + media); //mostra mais de usa casa depois do ponto
            }else{
                System.out.printf("Aprovado %.1f" , media); //mostra com virgula
            }
        }else{
            System.out.format("Reprovado por nota %.1f" , media); //mostra com virgula
        }

    }
}