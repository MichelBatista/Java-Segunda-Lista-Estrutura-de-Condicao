package com.company;

import java.util.Scanner;

/*
    Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá
    pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

    Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir
    os demais valores, sendo encerrado;

    Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
    Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
    Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
 */

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EQUAÇÃO DE SEGUNDO GRAU (ax² + bx + c)\n===========================================");
        System.out.print("Digite o valor de ax²: ");
        double valorDeA = scanner.nextDouble();
        if (valorDeA == 0) {
            System.out.println("O Valor de A é igual a zero, a equação não é do segundo grau");
        } else {
            System.out.print("Digite o valor de bx: ");
            double valorDeB = scanner.nextInt();
            System.out.print("Digite o valor de c: ");
            double valorDeC = scanner.nextInt();
            System.out.println("===========================================");
            double valorDeDelta = (valorDeB * valorDeB) - (4 * valorDeA * valorDeC);
            boolean valorDeDeltaForMenorQueZero = valorDeDelta < 0;
            boolean valorDeDeltaForIgualAZero = valorDeDelta == 0;
            if (valorDeDeltaForMenorQueZero) {
                System.out.println("O delta é menor que zero, portanto as raizes são imaginarias.");
            } else if (valorDeDeltaForIgualAZero) {
                double raizUm = -valorDeB / (2 * valorDeA);
                System.out.println("Delta = 0, raiz = " + raizUm);
            } else {
                double raizUm = (-valorDeB - Math.sqrt(valorDeDelta)) / (2 * valorDeA);
                double raizDois = (-valorDeB + Math.sqrt(valorDeDelta)) / (2 * valorDeA);
                System.out.println("Temos as raizes { " + raizUm + " , " + raizDois + "  }");
            }
        }
        scanner.close();
    }
}