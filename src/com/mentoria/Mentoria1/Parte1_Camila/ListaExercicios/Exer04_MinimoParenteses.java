package com.luizacode.aula05_Sabado.Parte1_Camila.ListaExercicios;

public class Exer04_MinimoParenteses {

    public static void main (String[] args){

        System.out.println("==============================================================");
        System.out.println("Escreva as intruções abaixo com o minino de parentes possiveis");
        System.out.println("===============================================================");

        boolean a = 6*(3+2) == 6*5;
        boolean b = 2+(6*(3+2)) == 2+30;
        boolean c = 2+(3*6)/(2+4) == 2+3;
        boolean d = 2*(8/(3+1)) == 2+(8/4);
        boolean e = 3+(16-2)/2*(9-2) == 3+49;
        boolean f = (6/3)+(8/2) == 2 + 4;
        boolean g = (3+(8/2))*4+(3*2) == 28+6;
        boolean h = (6*(3*3)+6)-10 == 60-10;
        boolean i = ((10*8)+3)*9 == 83*9;
        boolean j = ((-12)*(-4))+(3*(-4)) == 48-12;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
