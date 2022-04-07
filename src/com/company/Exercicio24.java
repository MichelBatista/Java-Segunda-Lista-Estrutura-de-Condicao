package com.company;

import java.util.Scanner;

//Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado
// da operação deve ser acompanhado de uma frase que diga se o número é:
//par ou ímpar;
//positivo ou negativo;
//inteiro ou decimal.

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        float primeiroNumero = scanner.nextFloat();
        System.out.print("Digite o segundo numero: ");
        float segundoNumero = scanner.nextFloat();
        System.out.println("=======================");
        System.out.print("[1] = Impar ou Par\n[2] = Positivo ou Negativo\n[3] = Inteiro ou Decimal\nEscolha uma das opçôes: ");
        byte opçaoEscohlida = scanner.nextByte();
        System.out.println("=======================");
        switch (opçaoEscohlida) {
            case 1:
                if (primeiroNumero % 2 == 0) {
                    System.out.println("O numero [" + primeiroNumero + "] é PAR");
                } else {
                    System.out.println("O numero [" + primeiroNumero + "] é IMPAR");
                }
                if (segundoNumero % 2 == 0) {
                    System.out.println("O numero [" + segundoNumero + "] é PAR");
                } else {
                    System.out.println("O numero [" + segundoNumero + "] é IMPAR");
                }
                break;
            case 2:
                if (primeiroNumero >= 0) {
                    System.out.println("O numero [" + primeiroNumero + "] é POSITIVO");
                } else {
                    System.out.println("O numero [" + primeiroNumero + "] é NEGATIVO");
                }
                if (segundoNumero >= 0) {
                    System.out.println("O numero [" + segundoNumero + "] é POSITIVO");
                } else {
                    System.out.println("O numero [" + segundoNumero + "] é NEGATIVO");
                }
                break;
            case 3:
                if (primeiroNumero % 1 == 0) {
                    System.out.println("O numero [" + primeiroNumero + "] é INTEIRO");
                } else {
                    System.out.println("O numero [" + primeiroNumero + "] é DECIMAL");
                }
                if (segundoNumero % 1 == 0) {
                    System.out.println("O numero [" + segundoNumero + "] é INTEIRO");
                } else {
                    System.out.println("O numero [" + segundoNumero + "] é DECIMAL");
                }
                break;
            default:
                System.out.println("Opção Invalida.");
        }
    }
}