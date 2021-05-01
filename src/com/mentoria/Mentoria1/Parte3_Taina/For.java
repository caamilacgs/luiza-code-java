package com.mentoria.Mentoria1.Parte3_Taina;

import java.util.Scanner;

public class For {

        public static void main(String[] args) {

            int count;
            float media= 100;

            Scanner teclado = new Scanner(System.in);
            System.out.print("Informe sua media: ");
            media = teclado.nextFloat();

            //contador -: condição -: Incrementador
            for(count=0;media >=7; count++){
                media = teclado.nextFloat();
                if(media >= 7){
                    System.out.println("Aprovado");
                }else{
                    System.out.println("Reprovado");
                }
        }
        }
}
