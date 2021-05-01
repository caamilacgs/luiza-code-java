package com.luizacode.aula06.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        System.out.println("----Pessoa----");
        System.out.println(pessoa.nome);
        System.out.print(pessoa.diaNascimento + "/" + pessoa.diaNascimento+ "/" + pessoa.anoNascimento +"\n");
        System.out.println(pessoa.altura);

    }
}
