package com.mentoria.Mentoria1.Parte3_Taina;
public class MediaAlunoIF {

    public static void main(String[] args) {

        float n1 = 10;
        float n2 = 1;

        float media = (n1 + n2) /2;

        System.out.println(media);

        if(media >= 7){
            //verdade
            System.out.println("Huhulllll! Aprovado");
        }else if(media >4 && media < 7){
            //verdade
            System.out.println("Fazer o Teste");
            //falso
        } else{
            System.out.println("Reprovado");

            //OPERADOR TERNARIO
//        String resultado = (media >= 7) ? "Ternario-Aprovado" : "Ternario-Reprovado";
//        System.out.println(resultado);

        }
    }
}
