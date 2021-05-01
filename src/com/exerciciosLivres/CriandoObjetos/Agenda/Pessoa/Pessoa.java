package com.luizacode.aula06.Pessoa;

import java.util.Scanner;

// Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura.
// Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa.
// Crie um método para calcular a idade da pessoa.

public class Pessoa {

    //atributos
    String nome;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    float altura;

    //Construtor Default
    Pessoa(){
        nome = "Camila";
        diaNascimento = 20;
        mesNascimento = 9;
        anoNascimento = 1996;
        altura = (float) 1.74;
    }
    //Construtor private



    //Contrutor public
    public String getNome(){
        return nome;
    }
    public int getDataNascimento(){
        return diaNascimento + mesNascimento + anoNascimento;
    }
    public float getAltura() {
        return altura;
    }

    //metodo
    public int CalcularIdade() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a data de nascimento somente numeros: ");
        int anoAtual = scan.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("Idade : "+ idade);

        return idade;
    }
    public String ConsultarDataNascimento(){
        String dataNascimento = (diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
        return dataNascimento;
    }
}
