package com.atividades.Atividade03.versao2;

public class Cliente {

    //atributos (variaveis)
    private String nome;
    private long cpf;
    private String rg;

    //metodo get para que o atributo seja acessado por outra classe
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }

    //Construtor
    public Cliente(String nome, long cpf, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
}
