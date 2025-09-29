package br.senai.sp.jandira.imccondicional.model;

import java.util.Scanner;

public class Aluno {

    String nome;
    String status;
    double peso;
    double imc;
    double altura;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos começar!");
        System.out.print("Primeiro, digite seu nome: ");
        nome = leitor.nextLine();

        System.out.print("Obrigado! Agora digite seu peso em kilogramas (kg): ");
        peso = leitor.nextDouble();

        System.out.print("Quase lá. Só falta a sua altura! Pode digita-la em metros? ");
        altura = leitor.nextDouble();

        calcularImc();
    }

    public void calcularImc(){
        double alturaAoQuadrado = altura * altura;

        imc = peso / alturaAoQuadrado;

        classificarCondicao();
    }

    public void classificarCondicao(){
        if (imc < 18.6){
            status = "Abaixo do Peso";
        } else if (imc >= 18.6 && imc < 25.0){
            status = "Peso Ideal (Parabéns)";
        } else if (imc >= 25.0 && imc < 30.0){
            status = "Levemente Acima do Peso";
        } else if (imc >= 30.0 && imc < 35.0){
            status = "Obesidade (Grau I)";
        } else if (imc >= 35.0 && imc < 40.0){
            status = "Obesidade Severa (Grau II)";
        } else {
            status = "Obesidade Mórbida (Grau III)";
        }

        exibirResultados();
    }

    public void exibirResultados(){
        String imcDecimal = String.format("%.2f", imc);

        System.out.println("-------------------------------------");
        System.out.println("------ CALCULADORA DE IMC ------");
        System.out.println("-------------------------------------");
        System.out.println("NOME: " + nome);
        System.out.println("PESO: " + peso);
        System.out.println("ALTURA: " + altura);
        System.out.println("------ RESULTADOS ------");
        System.out.println("IMC: " + imcDecimal);
        System.out.println("STATUS: " + status);
        System.out.println("-------------------------------------");
    }
}
