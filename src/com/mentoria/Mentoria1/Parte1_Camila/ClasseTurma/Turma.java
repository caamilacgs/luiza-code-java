package com.mentoria.Mentoria1.Parte1_Camila.ClasseTurma;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    public String Turno;
    public String faixaEtaria;
    public  List<Aluno> alunos = new ArrayList<>();
	private Aluno aluno;

    public void adicionarAluno(Aluno aluno){
        this.aluno = aluno;
        
		if (alunos.size()>=20){
            System.out.println("Aluno não pode entrar na turma");
        }else if(alunos.size() <=20){
            System.out.println("Aluno foi inscrito na turma");
            alunos.add(aluno);

        }
    }
}
