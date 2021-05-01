package com.aulas.FundamentosJava;

public class EstruturaRepeticao {

    public static void main(String[] args) {


//      //FOR
        //Quando eu sei a quantidade de vezes que vou repetir
//        //contador -: condição -: Incrementador
//        for (int count1 = 100; count1 <= 200; count1++) {
//            if (count1 % 8 == 0) {
//                System.out.printf("O numero %d é divisivel por 8\n", count1);
//            }
//        }

        //WHILE
        //Quando eu nao sei a quantidade de vezes que vai repetir
        int count = 1;
        while (count <= 200) {
            //bloco de comando
            System.out.printf("O numero %d e divisivel por 8\n", count);
            //incremento
            count++;
        }

//        //DO WHILE
//        int count3 = 1;
//        do {
//            //bloco de comandos
//            System.out.printf("O numero %d nao e divisivel por 8\n", count3);
//            //incremento
//            count3++;
//        }while(count3 <= 10);

    }
}


