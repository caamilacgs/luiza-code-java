package com.atividades.Atividade03.versao2;

import com.atividades.Atividade03.versao2.Cliente;
import com.atividades.Atividade03.versao2.Conta;

public class ContaPoupanca extends Conta {

    //contrutor
    public ContaPoupanca(Cliente cliente, long numeroDaConta){
        super(cliente, numeroDaConta);
    }

    //metodo abstrato
    @Override
    public void pix(double valor, Conta contaDeDestino){
        if (valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - (valor + 0.0));
            contaDeDestino.depositar(valor);
        } else {
            System.out.println("Limite indisponivel para transferencia");
        }
    }
}
