package com.aulas.aula07;

public class Cliente {


    private String nome;
    private long cpf;
    private long rg;

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public long getRg() {
        return rg;
    }

    public Cliente(String nome, long cpf, long rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
}
