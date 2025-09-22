package br.senai.sp.jandira.imccondicional;

import br.senai.sp.jandira.imccondicional.model.Aluno;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa...");

        Aluno classificacao = new Aluno();

        classificacao.obterDados();
    }
}
