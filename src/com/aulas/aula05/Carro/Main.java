package com.aulas.aula05.Carro;

public class Main {

    public static void main(String[] args) {

        //System.out.println(ferrari);

        System.out.println("\nPrimeiro Carro...\n");

        Carro ferrari = new Carro();
        System.out.println(ferrari.marca);
        System.out.println(ferrari.blindado);
        System.out.println(ferrari.cor);
        System.out.println(ferrari.numeroDePortas);

        System.out.println("\nCriando um Novo carro...\n");

        Carro palio = new Carro("Prata", "Pálio" , 4 ,  true);
        System.out.println(palio.marca);
        System.out.println(palio.blindado);
        System.out.println(palio.cor);
        System.out.println(palio.numeroDePortas);

        palio.acelerar();
        palio.frear();

    }
}
