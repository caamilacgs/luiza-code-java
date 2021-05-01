package com.atividades.Atividade01;

import java.util.Scanner;

public class ProgramaAcademico {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("===============================");
        System.out.println("       PROGRAMA ACADEMICO");
        System.out.println("===============================");

        //entrada
        System.out.print("Informe a nota 1: ");
        float nota1 = input.nextFloat();

        System.out.print("Informe a nota 2: ");
        float nota2 = input.nextFloat();

        System.out.print("Informe a nota 3: ");
        float nota3 = input.nextFloat();

        System.out.print("Informe o numero de faltas: ");
        int faltas = input.nextInt();

        //processamento
        float media = (nota1+nota2+nota3)/ 3;

        //Saida
        if (media >= 7.0 ){
            if (faltas >= (68*0.25)){ //compara a falta com o percentual
                System.out.println("\nReprovado por falta " + media);
            }else{
                System.out.printf("\nAprovado %.1f ", media);
            }
        }else{
            System.out.format("\nReprovado por nota %.1f ", media);
        }
    }
}

//Observações
// A saida aparece em formatos diferente porque testei o println, printf e o format e utilizei o print na entrada.