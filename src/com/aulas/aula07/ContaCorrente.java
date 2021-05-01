package com.aulas.aula07;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente, long numeroDaConta){
        super(cliente, numeroDaConta);
    }

    @Override
    public void pix(double valor, Conta contaDeDestino){
        if (valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - (valor + 0.2));
            contaDeDestino.depositar(valor);
        } else {
            System.out.println("Limite indisponível para transferência");
        }
    }
}
