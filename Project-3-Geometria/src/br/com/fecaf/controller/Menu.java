package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo; // Adicionado para manipular o Triângulo

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        boolean exit = false;

        while (!exit) {

            System.out.println("/************************/");
            System.out.println("/*      Geometria       */");
            System.out.println("/************************/");
            System.out.println("/* 1 - Círculo          */");
            System.out.println("/* 2 - Retângulo        */");
            System.out.println("/* 3 - Triângulo        */");
            System.out.println("/* 4 - Sair             */");
            System.out.println("/************************/");
            System.out.print("Informe a opção desejada:");

            int optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:
                    boolean exitCirculo = false;
                    boolean validaCadastroCirculo = false;
                    Circulo circulo = new Circulo();

                    while (!exitCirculo) {
                        System.out.println("/*************************/");
                        System.out.println("/*        Círculo        */");
                        System.out.println("/*************************/");
                        System.out.println("/* 1 - Cadastrar Círculo */");
                        System.out.println("/* 2 - Calcular Área     */");
                        System.out.println("/* 3 - Calcular Perímetro */");
                        System.out.println("/* 4 - Sair              */");
                        System.out.println("/*************************/");

                        System.out.print("Escolha uma opção: ");
                        int optionCirculo = scanner.nextInt();

                        switch (optionCirculo) {
                            case 1:
                                System.out.println("Cadastrando Círculo...");
                                validaCadastroCirculo = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastroCirculo) {
                                    System.out.println("Calculando Área");
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Círculo primeiro.");
                                }
                                break;
                            case 3:
                                if (validaCadastroCirculo) {
                                    System.out.println("Calculando Perímetro...");
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Círculo primeiro.");
                                }
                                break;
                            case 4:
                                System.out.println("Voltando para Menu...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Opção Inválida...");
                        }
                    }
                    break;

                case 2:
                    boolean exitRetangulo = false;
                    boolean validaCadastroRetangulo = false;
                    Retangulo retangulo = new Retangulo();

                    while (!exitRetangulo) {
                        System.out.println("/*************************/");
                        System.out.println("/*       Retângulo       */");
                        System.out.println("/*************************/");
                        System.out.println("/* 1 - Cadastrar Retângulo */");
                        System.out.println("/* 2 - Calcular Área       */");
                        System.out.println("/* 3 - Calcular Perímetro  */");
                        System.out.println("/* 4 - Definir Quadrado    */");
                        System.out.println("/* 5 - Sair                */");
                        System.out.println("/***************************/");

                        System.out.print("Escolha uma opção: ");
                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                System.out.println("Cadastrando Retângulo...");
                                validaCadastroRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if (validaCadastroRetangulo) {
                                    System.out.println("Calculando Área...");
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retângulo primeiro.");
                                }
                                break;
                            case 3:
                                if (validaCadastroRetangulo) {
                                    System.out.println("Calculando Perímetro...");
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Retângulo primeiro.");
                                }
                                break;
                            case 4:
                                if (validaCadastroRetangulo) {
                                    System.out.println("Definindo se é Quadrado...");
                                    retangulo.validarQuadrado();
                                } else {
                                    System.out.println("Cadastre um Retângulo primeiro.");
                                }
                                break;
                            case 5:
                                System.out.println("Voltando para o Menu...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Opção Inválida...");
                        }
                    }
                    break;

                case 3:
                    boolean exitTriangulo = false;
                    boolean validaCadastroTriangulo = false;
                    Triangulo triangulo = new Triangulo();

                    while (!exitTriangulo) {
                        System.out.println("/*************************/");
                        System.out.println("/*       Triângulo       */");
                        System.out.println("/*************************/");
                        System.out.println("/* 1 - Cadastrar Triângulo */");
                        System.out.println("/* 2 - Calcular Área       */");
                        System.out.println("/* 3 - Calcular Perímetro  */");
                        System.out.println("/* 4 - Classificar Tipo    */");
                        System.out.println("/* 5 - Verificar 3-4-5     */");
                        System.out.println("/* 6 - Sair                */");
                        System.out.println("/***************************/");

                        System.out.print("Escolha uma opção: ");
                        int optionTriangulo = scanner.nextInt();

                        switch (optionTriangulo) {
                            case 1:
                                System.out.println("Cadastrando Triângulo...");
                                validaCadastroTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if (validaCadastroTriangulo) {
                                    System.out.println("Calculando Área...");
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triângulo primeiro.");
                                }
                                break;
                            case 3:
                                if (validaCadastroTriangulo) {
                                    System.out.println("Calculando Perímetro...");
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Triângulo primeiro.");
                                }
                                break;
                            case 4:
                                if (validaCadastroTriangulo) {
                                    System.out.println("Classificando Tipo...");
                                    triangulo.classificandoTipo();
                                } else {
                                    System.out.println("Cadastre um Triângulo primeiro.");
                                }
                                break;
                            case 5:
                                if (validaCadastroTriangulo) {
                                    System.out.println("Verificando se é um triângulo 3-4-5...");
                                    triangulo.classificando345();
                                } else {
                                    System.out.println("Cadastre um Triângulo primeiro.");
                                }
                                break;
                            case 6:
                                System.out.println("Voltando para o Menu...");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Opção Inválida...");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo ....");
                    exit = true;
                    break;
                default:
                    System.out.println("Opção Inválida...");
            }
        }
    }
}
