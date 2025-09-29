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
        if (imc <= 18.50){
            status = "Abaixo do Peso";
        } else if (imc <= 24.90){
            status = "Peso Ideal";
        } else if (imc <= 29.90){
            status = "Acima do Peso";
        } else if (imc <= 34.90){
            status = "Obesidade";
        } else if (imc <= 39.90){
            status = "Obesidade Severa";
        } else {
            status = "Obesidade Mórbida";
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
