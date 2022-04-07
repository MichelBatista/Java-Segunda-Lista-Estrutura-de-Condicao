package com.company;

import java.util.Scanner;

//Faça um Programa que leia três números e mostre o maior deles.

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundoNumero = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int terceiroNumero = scanner.nextInt();
        System.out.println("========================");
        boolean todosOsNumerosForemDiferentes = primeiroNumero != segundoNumero && primeiroNumero != terceiroNumero && segundoNumero != terceiroNumero;
        if (todosOsNumerosForemDiferentes) {
            boolean primeiroNumeroForOMaior = primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero;
            boolean segundoNumeroForOMaior = segundoNumero > primeiroNumero && segundoNumero > terceiroNumero;
            if (primeiroNumeroForOMaior) {
                System.out.println("O maior numero é: " + primeiroNumero);
            } else if (segundoNumeroForOMaior) {
                System.out.println("O maior numero é: " + segundoNumero);
            } else {
                System.out.println("O maior numero é: " + terceiroNumero);
            }
        } else {
            System.out.println("Você informou numero iguais.");
        }
        scanner.close();
    }
}