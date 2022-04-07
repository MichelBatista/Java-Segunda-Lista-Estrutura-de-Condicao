package com.company;

import java.util.Scanner;

//Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        float numeroInformado = scanner.nextFloat();
        System.out.println("========================");
        boolean numeroInformadoForInteiro = numeroInformado % 1 == 0;
        if (numeroInformadoForInteiro) {
            System.out.println("Numero INTEIRO");
        } else {
            System.out.println("Numero DEICMAL");
        }
        scanner.close();
    }
}