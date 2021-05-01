package com.atividades.Atividade03;

public class Main {

    public static void main(String[] args) {

        //Menu da classe conta
        Conta conta = new Conta();

        System.out.println("======================================");
        System.out.println("DADOS DO CONSTRUTOR");
        System.out.println("Numero da conta: " + conta.numeroConta);
        System.out.println("Nome do Cliente: " + conta.nomeCliente);
        System.out.println("Saldo da conta: " + conta.saldo);
        System.out.println("Limite da conta: " + conta.limite);
        System.out.println("======================================");

        //Metodos
        System.out.println("CONSULTA SALDO");
        conta.consultarSaldo();
        System.out.println("======================================");

        System.out.println("DEPOSITO:");
        conta.deposito(200);
        System.out.println("======================================");

        System.out.println("SAQUE:");
        conta.saque(500);
        System.out.println("======================================");


    }
}
