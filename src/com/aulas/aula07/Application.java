package com.aulas.aula07;

public class Application {

    public static void main(String[] args){

        Cliente cliente1 = new Cliente("Mariana Mercier", 987251645153L, 917837247L);
        Conta contaDeOrigem = new ContaCorrente(cliente1, 123456789L);


        Cliente cliente2 = new Cliente("Marcela", 987251645153L, 917837247L);
        Conta contaDeDestino = new ContaPoupanca(cliente2, 14587298L);


        contaDeOrigem.depositar(10000);
        contaDeDestino.depositar(4000);
//
        System.out.println(contaDeOrigem.getSaldo());
        System.out.println(contaDeDestino.getSaldo());

        contaDeOrigem.pix(1000, contaDeDestino);
        contaDeDestino.pix(100, contaDeOrigem);

        System.out.println("-----------------------------------------");

        System.out.println(contaDeOrigem.getSaldo());
        System.out.println(contaDeDestino.getSaldo());

    }
}
