package com.mentoria.Mentoria1.Parte3_Taina;
import java.util.Scanner;

public class ForNumeros {
    public static void main(String[] args) {

        //contador -: condição -: Incrementador
        for (int count = 100; count <= 200; count++) {
            if(count % 8 == 0 ){
                System.out.printf("O numero %d é divisivel por 8\n", count);
            }
        }
    }
}