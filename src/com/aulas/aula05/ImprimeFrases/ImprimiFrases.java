package com.aulas.aula05.ImprimeFrases;

public class ImprimiFrases {

    //atributos
    String frase;

    //construtor
    public ImprimiFrases(){
        this.frase = "Ola Mundo";
    }

    //metodo
    public ImprimiFrases(String frase){
        this.frase = frase;
    }
    public void imprimeFraseNoConsole(){
        System.out.println(frase);
    }
}

//    forma sem orietação a objeto
//    public static void main(String[] args) {
//        System.out.println("Ola Mundo!");
//    }
