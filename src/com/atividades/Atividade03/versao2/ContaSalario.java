package com.atividades.Atividade03.versao2;

import com.atividades.Atividade03.versao2.Cliente;
import com.atividades.Atividade03.versao2.Conta;

public class ContaSalario extends Conta {

    //contrutor
    public ContaSalario(Cliente cliente, long numeroDaConta){
        super(cliente, numeroDaConta);
    }

    //metodo abstrato
    @Override
    public void pix(double valor, Conta contaDeDestino){
        if (valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - (valor + 0.1));
            contaDeDestino.depositar(valor);
        } else {
            System.out.println("Saldo indisponivel para realizar transferencia");
        }
    }
}
