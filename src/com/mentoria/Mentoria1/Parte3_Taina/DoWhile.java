package com.mentoria.Mentoria1.Parte3_Taina;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        int count = 1;

        do {
            //bloco de comandos
            System.out.printf("O numero %d nao e divisivel por 8\n", count);
            //incremento
            count++;
        }while(count <= 10);
    }
}

