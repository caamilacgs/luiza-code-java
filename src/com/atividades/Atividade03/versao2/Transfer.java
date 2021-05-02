package com.atividades.Atividade03.versao2;

import com.atividades.Atividade03.versao2.Conta;

public interface Transfer {

    //delcaração de campos obrigatorios
    void pix(double valor, Conta contaDeDestino);
}
