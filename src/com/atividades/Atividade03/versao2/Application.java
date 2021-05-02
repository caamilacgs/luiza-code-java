package com.atividades.Atividade03.versao2;

public class Application {

    public static void main(String[] args) {

        System.out.println("CRIAR CONTAS:");

        System.out.println("Criando Conta Corrente");
        Cliente cliente1 = new Cliente("Camila Coutinho", 987251645153L, "917837247");
        Conta contaCamila = new ContaCorrente(cliente1, 123456789L);

        System.out.println("Criando Conta Poupanca");
        Cliente cliente2 = new Cliente("Mariana", 987251645153L, "917837247");
        Conta contaMariana = new ContaPoupanca(cliente2, 14587298L);

        System.out.println("Criando Conta Salario");
        Cliente cliente3 = new Cliente("Larissa", 987251645153L, "917837247");
        Conta contaLarissa = new ContaSalario(cliente3, 14587298L);

        System.out.println("Criando Conta Conjunta");
        Cliente cliente4 = new Cliente("Bruna", 987251645153L, "917837247");
        Cliente cliente5 = new Cliente("Caio", 987251645153L, "917837247");
        Conta contaConjunta1 = new ContaConjunta(cliente4, cliente5,12389L);

        System.out.println("----------------------------------------------------");
        System.out.println("REALIZAR DEPOSITO:");

        contaCamila.depositar(8000);
        contaMariana.depositar(4000);
        contaLarissa.depositar(500);
        contaConjunta1.depositar(1200);

        System.out.println("----------------------------------------------------");
        System.out.println("CONSULTAR SALDO:");
        System.out.println(contaCamila.getSaldo()); //metodo get
        System.out.println(contaMariana.getSaldo()); //metodo get
        System.out.println(contaLarissa.getSaldo()); //metodo get
        System.out.println(contaConjunta1.getSaldo()); //metodo get

        System.out.println("----------------------------------------------------");
        System.out.println("REALIZAR SAQUE:");
        contaCamila.sacar(525);
        contaMariana.sacar(150);
        contaLarissa.sacar(50);
        contaConjunta1.sacar(100);

        System.out.println("----------------------------------------------------");
        System.out.println("CONSULTAR SALDO:");
        contaCamila.consultarSaldo(); //metodo consultarSaldo
        contaMariana.consultarSaldo(); //metodo consultarSaldo
        contaLarissa.consultarSaldo(); //metodo consultarSaldo
        contaConjunta1.consultarSaldo(); //metodo consultarSaldo

        System.out.println("----------------------------------------------------");
        System.out.println("TRANFERIR PIX:");

        contaCamila.pix(250, contaLarissa); // contaOrigem -> contaDestino
        contaLarissa.pix(100, contaCamila); // contaDestino -> contaOrigem

        //Saldo apos pix
        System.out.println("\nSaldo apos o pix: ");
        System.out.println(contaCamila.getSaldo());
        System.out.println(contaLarissa.getSaldo());
    }
}
