package com.aulas.aula04;

import java.util.ArrayList;

public class ArrayAlunas {

    public static void main(String[] args) {
//        System.out.println("Nome das meninas:");
//        //1.Exemplo sem array
//        String nome1 = "Camila";
//        String nome2 = "Camila";
//
//        for(nomes:)
//        System.out.println(nome1);
//        System.out.println(nome2);
//
        //-----------------------------------------------------------------------
//        //2.exemplo com array
//
//        String [] nome = new String [30];
//
//        nome[0] = "Beatriz";
//        nome[1] = "Camila";
//        nome[2] = "Marcela";
//        nome[3] = "Larissa";
//        nome[4] = "Julia";
//
//        for(int i = 0; i < 30; i++)
//            System.out.println(nome[i]);

        //-----------------------------------------------------------------------
//
//        //3. Adicionando multiplos de 3 em um array de 5 posicoes
//
//        int [] numeros = new int[5];
//        for(int i = 0; i < numeros.length; i ++){
//        //for (int i = 0; i< 4; i++){
//            numeros[i] = i;
//            System.out.println(numeros[i]);
//        }
//        //System.out.println(numeros);

        //-----------------------------------------------------------------------

//        //4. MULTIPLOS DE 3 COM UM ARRAY
//        int [] numeros = new int[5];
//        int contador = 0;
//
//        for (int i = 0; i < numeros.length; i++){
//            if (i % 3 == 0){
//                numeros[contador]= i;
//                System.out.println("adicione " + i + " na lista.");
//                contador ++;
//            }
//        }
//        for (int i = 0; i < numeros.length; i ++){
//            System.out.println(numeros[i]);
//
        //-----------------------------------------------------------------------

        //5.

        ArrayList numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                numeros.add(i);
                System.out.println("adicionei" + i + "na lista.");
            }
        }
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
}