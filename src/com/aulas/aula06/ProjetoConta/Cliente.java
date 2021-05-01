package com.aulas.aula06.ProjetoConta;


public class Cliente {

    private String nomeCliente;
    private long cpf;
    private String rg;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public long getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public Cliente(String nomeCliente, long cpf, String rg){
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.rg = rg;
    }

}
