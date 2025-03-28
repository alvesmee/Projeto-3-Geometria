package br.com.fecaf.model;

import java.util.Arrays; // Usando a biblioteca para organizar os lados do triângulo
import java.util.Scanner;

public class Triangulo {
    // Variáveis para armazenar as medidas e resultados
    public double base, altura, lado1, lado2, area, perimetro;

    // Objeto Scanner para pegar as informações do usuário
    Scanner scanner = new Scanner(System.in);

    // Método para cadastrar o triângulo
    public boolean cadastrarTriangulo() {
        System.out.println("/**********************************************/");
        System.out.println("/*             Cadastro do Triângulo         */");
        System.out.println("/**********************************************/");
        System.out.println("Digite a base do triângulo:");
        base = scanner.nextDouble();
        System.out.println("Digite o segundo lado:");
        lado1 = scanner.nextDouble();
        System.out.println("Digite o terceiro lado:");
        lado2 = scanner.nextDouble();
        System.out.println("Agora, informe a altura:");
        altura = scanner.nextDouble();

        return true;
    }

    // Método para calcular a área
    public void calcularArea() {
        System.out.println("/**********************************************/");
        System.out.println("/*          Calculando a Área do Triângulo   */");
        System.out.println("/**********************************************/");

        area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
    }

    // Método para calcular o perímetro
    public void calcularPerimetro() {
        System.out.println("/**********************************************/");
        System.out.println("/*          Calculando o Perímetro           */");
        System.out.println("/**********************************************/");

        perimetro = base + lado1 + lado2;
        System.out.println("O perímetro do triângulo é: " + perimetro);
    }

    // Método para verificar se é um triângulo 3-4-5 ou retângulo
    public void classificando345() {
        System.out.println("/**********************************************/");
        System.out.println("/*   Classificando o Triângulo - Ângulo      */");
        System.out.println("/**********************************************/");

        // Organizando os lados em ordem crescente
        double[] lados = {base, lado1, lado2};
        Arrays.sort(lados);

        // Verificando se é um triângulo retângulo (Teorema de Pitágoras)
        if (Math.pow(lados[0], 2) + Math.pow(lados[1], 2) == Math.pow(lados[2], 2)) {
            System.out.println("Este triângulo é um retângulo!");

            // Verificar se os lados são múltiplos de (3,4,5)
            double fator1 = lados[0] / 3;
            double fator2 = lados[1] / 4;
            double fator3 = lados[2] / 5;

            // Se todos os fatores forem iguais, é um múltiplo de 3-4-5
            if (fator1 == fator2 && fator1 == fator3) {
                System.out.println("Este triângulo é um múltiplo do triângulo 3-4-5!");
            }
        } else {
            System.out.println("Este não é um triângulo retângulo...");
        }
    }


    // Método para classificar o tipo de triângulo pelo lado
    public void classificandoTipo() {
        System.out.println("/*****************************************/");
        System.out.println("/*   Definindo o Tipo de Triângulo       */");
        System.out.println("/*****************************************/");

        // Classificando o triângulo pelos seus lados
        if (base == lado1 && base == lado2) {
            System.out.println("Esse triângulo é Equilátero!");
        } else if (base != lado1 && base != lado2 && lado1 != lado2) {
            System.out.println("Esse triângulo é Escaleno!");
        } else {
            System.out.println("Esse triângulo é Isósceles!");
        }
    }
}
