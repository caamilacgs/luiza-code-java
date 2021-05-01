package com.loiane.ListaExercicios.ListaExercicios_aula11a13;

//14.Faça um programa que peça o tamanho de um arquivo para download (em MB)
// e a velocidade de um link de Internet (em Mbps),
// calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo: ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.print("Digite a velocidade da internet: ");
        double velocidadeInternet = scan.nextDouble();

        double tempo = tamanhoArquivo / velocidadeInternet;

        System.out.println("O tempo estimado para o download é: " + tempo);

    }
}

