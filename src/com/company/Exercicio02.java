package com.company;

import java.util.Scanner;

//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numeroInformado = scanner.nextInt();
        System.out.println("=====================");
        boolean numeroForPositvo = numeroInformado >= 0;
        if (numeroForPositvo) {
            System.out.println("O numero: " + numeroInformado + " é POSITIVO");
        } else {
            System.out.println("O numero: " + numeroInformado + " é NEGATIVO");
        }
        scanner.close();
    }
}