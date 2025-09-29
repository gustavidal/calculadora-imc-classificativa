package br.senai.sp.jandira.imccondicional.model;

public class Aluno {

    String nome;
    String status;
    int peso;
    double imc;
    double altura;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos começar!");
        System.out.print("Primeiro, digite seu nome: ");
        nome = leitor.nextLine();

        System.out.print("Obrigado! Agora digite seu peso em kilogramas (kg): ");
        peso = leitor.nextInt();

        System.out.print("Quase lá. Só falta a sua altura! Pode digita-la em metros?: ");
        altura = leitor.nextDouble();

        calcularImc();
    }

    public void calcularImc(){
        double alturaAoQuadrado = altura * altura;

        imc = peso / alturaAoQuadrado;

        classificarCondicao();
    }

    public void classificarCondicao(){
        if (imc <= 18.5){
            status = "ABAIXO DO PESO";
        } else if (imc <= 24.9){
            status = "PESO IDEAL";
        } else if (imc <= 29.9){
            status = "ACIMA DO PESO";
        } else if (imc <= 34.9){
            status = "OBESIDADE";
        } else if (imc <= 39.9){
            status = "OBESIDADE SEVERA";
        } else {
            status = "OBESIDADE MÓRBIDA";
        }

        exibirResultados();
    }

    public void exibirResultados(){
        String imcDecimal = String.format("%.2f", imc);

        System.out.println("-------------------------------------");
        System.out.println("NOME: " + nome);
        System.out.println("IMC: " + imcDecimal);
        System.out.println("STATUS: " + status);
        System.out.println("-------------------------------------");
    }
}
