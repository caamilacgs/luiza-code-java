package com.atividades.Atividade03.versao2;

import com.atividades.Atividade03.versao2.Cliente;
import com.atividades.Atividade03.versao2.Conta;

public class ContaConjunta extends Conta {

    private Cliente cliente2;

    //contrutor
    public ContaConjunta(Cliente cliente, Cliente cliente2, long numeroDaConta){
        super(cliente, numeroDaConta);
        this.cliente2 = cliente2;
    }

    //metodo abstrato
    @Override
    public void pix(double valor, Conta contaDeDestino) {

    }
}
