package com.aulas.aula03;

import java.util.Scanner;

public class MesComIF {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero referente a um mês: ");
        int numeroMes = input.nextInt();

        if(numeroMes == 1) {
            System.out.println("Mês é Janeiro");
        }
        else if(numeroMes == 2){
            System.out.println("Mês é Fevereiro");
        }
        else if(numeroMes == 3) {
            System.out.println("Mês é Março");
        }
        else if(numeroMes == 4) {
            System.out.println("Mês é Abril");
        }
        else if(numeroMes == 5) {
            System.out.println("Mês é Maio");
        }
        else if(numeroMes == 6) {
            System.out.println("Mês é Junho");
        }
        else if(numeroMes == 7) {
            System.out.println("Mês é Julho");
        }
        else if (numeroMes == 8) {
            System.out.println("Mês é Agosto");
        }
        else if(numeroMes == 9) {
            System.out.println("Mês é Setembro");
        }
        else if(numeroMes == 10) {
            System.out.println("Mês é Setembro");
        }
        else if(numeroMes == 11) {
            System.out.println("Mês é Novembro");
        }
        else if(numeroMes == 12) {
            System.out.println("Mês é Dezembro");
        }else{
            System.out.println("O numero digitado não corresponde a um mês.");
        }
    }
}
