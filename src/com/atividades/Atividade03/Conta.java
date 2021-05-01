
//Crie uma conta capaz de emitir o saldo do correntista, fazer deposito e saques

package com.atividades.Atividade03;

import java.util.Scanner;

public class Conta {

    Scanner scan = new Scanner(System.in);

    //variaveis -> atributos
    public int numeroConta;
    public String nomeCliente;
    public double saldo;
    public double limite;

    //Construtor
    public Conta() {
        this.numeroConta = 20214;
        this.nomeCliente = "Camila Coutinho";
        this.saldo = 900;
        this.limite = 1000; //cheque especial
    }

    {
        System.out.println("======================================");
        System.out.println("            *  Menu * ");
        System.out.println("======================================");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Efetuar Deposito");
        System.out.println("3 - Efetuar Saque");
        System.out.println("0 - Sair");
    }

    //Pega o valor - usamos quando queremos pegar uma variavel privada
    private int getNumero() {
        return numeroConta;
    }
    private String getNomeCliente() {
        return nomeCliente;
    }
    private double getSaldo() {
        return saldo;
    }
    private double getLimite() {
        return limite;
    }

    //Seta o Valor - usamos quando queremos atrubuir valor uma variavel privada
    private void setNumero(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    private void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    private double setSaldo(double saldoConta) {
        this.saldo = saldoConta;
        return saldoConta;
    }
    private void setLimite(double limiteConta) {
        this.limite = limiteConta;
    }

    //metodos
    public void consultarSaldo(){
        {
            System.out.println("Carrengando o saldo...");
            System.out.println("O saldo da conta é: " + saldo);
        }
    }
    public void deposito(double valor) {
        {
            System.out.println("O saldo da conta é: " + saldo);
            System.out.println("Efetuando o deposito no valor de: " + valor);
            System.out.println("Foi efetuado o depositado no valor de: " + valor);
            System.out.println("O saldo atual da conta é: " + (saldo + valor));
        }
    }
    public void saque(double valor) {
        {
            System.out.println("O saldo da conta é: " + saldo);
            System.out.println("Efetuando o saque no valor de: " + valor);
            System.out.println("Foi efetuado o saque no valor de: " + valor);
            System.out.println("O saldo atual da conta é: " + (saldo - valor));
        }
    }
}


