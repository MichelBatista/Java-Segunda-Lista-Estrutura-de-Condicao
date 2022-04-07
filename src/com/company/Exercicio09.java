package com.company;

import java.util.Scanner;

//Faça um Programa que leia três números e mostre-os em ordem decrescente.

public class Exercicio09 {
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
                System.out.print(primeiroNumero + " , ");
            } else if (segundoNumeroForOMaior) {
                System.out.print(segundoNumero + " , ");
            } else {
                System.out.print(terceiroNumero + " , ");
            }
            boolean primeiroNumeroNaoForNemOMaiorNemOMenor = (primeiroNumero > segundoNumero && primeiroNumero < terceiroNumero)
                    || (primeiroNumero < segundoNumero && primeiroNumero > terceiroNumero);
            boolean segundoNumeroNaoForNemOMaiorNemOMenor = (segundoNumero > primeiroNumero && segundoNumero < terceiroNumero)
                    || (segundoNumero < primeiroNumero && segundoNumero > terceiroNumero);
            if (primeiroNumeroNaoForNemOMaiorNemOMenor) {
                System.out.print(primeiroNumero + " , ");
            } else if (segundoNumeroNaoForNemOMaiorNemOMenor) {
                System.out.print(segundoNumero + " , ");
            } else {
                System.out.print(terceiroNumero + " , ");
            }
            boolean primeiroNumeroForOMenor = primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero;
            boolean segundoNumeroForOMenor = segundoNumero < primeiroNumero && segundoNumero < terceiroNumero;
            if (primeiroNumeroForOMenor) {
                System.out.print(primeiroNumero);
            } else if (segundoNumeroForOMenor) {
                System.out.print(segundoNumero);
            } else {
                System.out.print(terceiroNumero);
            }
        } else {
            System.out.println("Você informou numero iguais.");
        }
        scanner.close();
    }
}