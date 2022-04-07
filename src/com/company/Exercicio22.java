package com.company;

import java.util.Scanner;

//Faça um Programa que peça um número inteiro e determine se ele é par ou impar

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numeroInformado = scanner.nextInt();
        System.out.println("=====================");
        boolean numeroInformadoForPar = numeroInformado % 2 == 0;
        if (numeroInformadoForPar) {
            System.out.println("Numero PAR");
        } else {
            System.out.println("Numero IMPAR");
        }
        scanner.close();
    }
}