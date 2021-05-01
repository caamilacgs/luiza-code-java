package com.aulas.aula07;

public abstract class Conta {

    private Cliente cliente;
    private long numeroDaConta;
    private double saldo;

    public Cliente getCliente() {
        return cliente;
    }

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }

    public Conta(Cliente cliente, long numeroDaConta) {

        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Limite indisponível para saque");
        }
    }

    public void depositar(double valor) {

        this.saldo = this.saldo + valor;
    }

    public abstract void pix(double valor, Conta contaDeDestino);
}
