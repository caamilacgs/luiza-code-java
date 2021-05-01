
//Crie uma conta capaz de emitir o saldo do correntista, fazer deposito e saques

package com.aulas.aula06.ProjetoConta;

public class Conta {

    //variaveis de instancias
    private Cliente cliente; // objeto
    private long numeroConta;
    private double saldo;

    //Construtor define os parametros obrigatorios
    public Cliente getCliente() {
        return cliente;
    }
    public long getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public Conta(Cliente cliente, long numeroConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        {
            System.out.println("O saldo da conta é: " + saldo);
            System.out.println("Efetuando o deposito...");
            System.out.println("Foi efetuado o depositado no valor de: " + valor);
            //System.out.println("O saldo atual da conta é: " + (saldo + valor));
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo){
            this.saldo = this.saldo - valor;
        }else {
            System.out.println("O saldo da conta é: " + saldo);
            System.out.println("Efetuando o saque...");
            System.out.println("Foi efetuado o saque no valor de: " + valor);
            //System.out.println("O saldo atual da conta é: " + (saldo - valor));
        }
    }
    public void transferir(double valor, Conta contaDestino) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            contaDestino.depositar(valor);
            System.out.println("Transferindo...");
            System.out.println("Foi efetuado o saque no valor de: " + valor);
        } else {
            System.out.println("Limite indisponivel para transferencia");
        }
    }
}




    //Contrutor que ja incia com valores pre definidos
//        this.numeroConta = 20214;
//        this.nomeCliente = "Camila Coutinho";
//        this.saldo = BigDecimal.valueOf(900);
//        this.limite = 1000; //cheque especial
//
//    {
//        System.out.println("======================================");
//        System.out.println("            *  Menu * ");
//        System.out.println("======================================");
//        System.out.println("1 - Consultar Saldo");
//        System.out.println("2 - Efetuar Deposito");
//        System.out.println("3 - Efetuar Saque");
//        System.out.println("0 - Sair");
//    }
//
//    //Pega o valor - usamos quando queremos pegar uma variavel privada
//    private int getNumero() {
//        return numeroConta;
//    }
//    private String getNomeCliente() {
//        return nomeCliente;
//    }
//    private double getSaldo() {
//        return saldo;
//    }
//    private double getLimite() {
//        return limite;
//    }
//
//    //Seta o Valor - usamos quando queremos atrubuir valor uma variavel privada
//    private void setNumero(int numeroConta) {
//        this.numeroConta = numeroConta;
//    }
//    private void setNomeCliente(String nomeCliente) {
//        this.nomeCliente = nomeCliente;
//    }
//    private double setSaldo(double saldoConta) {
//        this.saldo = saldoConta;
//        return saldoConta;
//    }
//    private void setLimite(double limiteConta) {
//        this.limite = limiteConta;
//    }
//
//    //metodos
//    public void consultarSaldo(){
//        {
//            System.out.println("Carrengando o saldo...");
//            System.out.println("O saldo da conta é: " + saldo);
//        }
//    }
//    public void deposito(double valor) {
//        {
//            System.out.println("O saldo da conta é: " + saldo);
//            System.out.println("Efetuando o deposito no valor de: " + valor);
//            System.out.println("Foi efetuado o depositado no valor de: " + valor);
//            System.out.println("O saldo atual da conta é: " + (saldo + valor));
//        }
//    }
//    public void saque(double valor) {
//        {
//            System.out.println("O saldo da conta é: " + saldo);
//            System.out.println("Efetuando o saque no valor de: " + valor);
//            System.out.println("Foi efetuado o saque no valor de: " + valor);
//            System.out.println("O saldo atual da conta é: " + (saldo - valor));
//        }
//    }



