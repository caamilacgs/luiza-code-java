package com.mentoria.Mentoria1.Parte3_Taina;

public class While {

    public static void main(String[] args) {

        //FOR EU SEI QUANTAS VEZES ELE VAI REPETIR
//        //FOR -> contador -: condição -: Incrementador
//        for (int count = 100; count <= 200; count++) {
//            if (count % 8 == 0) {
//                System.out.printf("O numero %d é divisivel por 8\n", count);

        //Quando eu nao sei a quantidade de vezes que vai repetir
        int count = 1;
        while (count <= 200) {
            //bloco de comando
            System.out.printf("O numero %d é divisivel por 8\n", count);
            //incremento
            count++;
        }
    }
}
