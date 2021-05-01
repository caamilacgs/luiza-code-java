package com.aulas.aula05.Carro;

public class Carro {

    //atributos
    String cor;
    String marca;
    int numeroDePortas;
    Boolean blindado;

    //Construtor
    public Carro(){
        cor = "verde";
        marca = "Ferrari";
        numeroDePortas = 2;
        blindado = false;
    }
    //Construtor
    public Carro(String cor, String marca, int numeroDePortas, Boolean blindado){
        this.cor = cor;
        this.marca = marca;
        this.numeroDePortas = numeroDePortas;
        this.blindado = blindado;
    }

    //metodo
    public void acelerar(){
        System.out.println("Ferrari acelerando...");
    }
    //metodo
    public void frear(){
        System.out.println("Ferrari freando");
    }
}

