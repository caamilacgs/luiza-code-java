
//Crie uma conta capaz de emitir o saldo do correntista, fazer deposito e saques

package com.atividades.Atividade03.versao2;

public abstract class Conta {

    //atributos (variaveis)
    private Cliente cliente;
    private long numeroDaConta;
    private double saldo;

    //metodo get
    //Pega o valor - usamos quando queremos pegar uma variavel privada
    public Cliente getCliente() {
        return cliente;
    }
    public long getNumeroDaConta() {
        return numeroDaConta;
    }
    public double getSaldo() {
        return saldo;
    }

    //metodo set
    //Seta o Valor - usamos quando queremos atrubuir valor uma variavel privada
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setNumeroDaConta(long numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    //Construtor
    public Conta(Cliente cliente, long numeroDaConta) {
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
    }

    //metodos
    public void consultarSaldo() {
        {
            System.out.println("O saldo atual da conta é: " + saldo);
        }
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        {
            System.out.println("Foi efetuado o depositado no valor de: " + valor);
            //System.out.println("O saldo atual da conta é: " + (saldo + valor));
        }
    }

    public void sacar(double valor) {
        {
            if (valor <= this.saldo) {
                this.saldo = this.saldo - valor;
                System.out.println("Foi efetuado o saque no valor de: " + valor);
            } else {
                System.out.println("Limite indisponivel para saque");
            }
            //System.out.println("O saldo atual da conta é: " + (saldo - valor));
        }
    }
    //metodo abstrato pix
    public abstract void pix(double valor, Conta contaDeDestino);
}


