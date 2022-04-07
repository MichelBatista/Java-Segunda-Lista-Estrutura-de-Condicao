package com.company;

import java.util.Scanner;

//Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

//Dicas:
//Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do primeiro lado do triangulo: ");
        int primeiroLado = scanner.nextInt();
        System.out.print("Informe o valor do segundo lado do triangulo: ");
        int segundoLado = scanner.nextInt();
        System.out.print("Informe o valor do terceiro lado do triangulo: ");
        int terceiroLado = scanner.nextInt();
        System.out.println("========================================================");
        boolean todosOsLadosForemMaiorQueCentoEOitenta = primeiroLado + segundoLado + terceiroLado > 180;
        if (todosOsLadosForemMaiorQueCentoEOitenta) {
            System.out.println("Você ultrapassou os limites de um triangulo");
        } else {
            boolean eUmTriangulo = primeiroLado + segundoLado >= terceiroLado || primeiroLado + terceiroLado >= segundoLado ||
                    segundoLado + terceiroLado >= primeiroLado;
            if (!eUmTriangulo) {
                System.out.println("Os lados digitados não formam um triangulo.");
            } else {
                boolean tresLadosForemIguais = primeiroLado == segundoLado && primeiroLado == terceiroLado;
                boolean quaisquerDosDoisLadosForIguais = primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado;
                boolean tresLadosForemDiferentes = primeiroLado != segundoLado && segundoLado != terceiroLado;
                if (tresLadosForemIguais) {
                    System.out.println("Os três lados são iguais, por isso forma um triangulo [ EQUILATERO ].");
                } else if (quaisquerDosDoisLadosForIguais) {
                    System.out.println("Dois lados do triangulo são iguais, por isso forma um triangulo [ ISÓCELES ].");
                } else if (tresLadosForemDiferentes) {
                    System.out.println("Tres lados diferentes, por isso forma um triangulo [ ESCALENO ]. ");
                }
            }
        }
        scanner.close();
    }
}