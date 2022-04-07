package com.company;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima o maior deles.

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundoNumero = scanner.nextInt();
        System.out.println("=====================");
        boolean primeiroNumeroForMaior = primeiroNumero > segundoNumero;
        if (primeiroNumeroForMaior) {
            System.out.println("O maior numero é: " + primeiroNumero);
        } else {
            System.out.println("O maior numero é: " + segundoNumero);
        }
        scanner.close();
    }
}