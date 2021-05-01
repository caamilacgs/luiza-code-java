package com.aulas.aula05.ImprimeFrases;

public class Main {

    public static void main(String[] args) {

    ImprimiFrases imprimiFrasesPadrao = new ImprimiFrases();
    ImprimiFrases imprimiFrasesFlexivel = new ImprimiFrases("Frase Flexivel");

    imprimiFrasesPadrao.imprimeFraseNoConsole();
    imprimiFrasesFlexivel.imprimeFraseNoConsole();

    }
}
