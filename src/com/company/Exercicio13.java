package com.company;

import java.util.Scanner;

//Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.),
// se digitar outro valor deve aparecer valor inválido.

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero para sabermos o dia da semana\nExemplo [1] - Domingo: ");
        byte numeroInformado = scanner.nextByte();
        System.out.println("=====================");
        switch (numeroInformado) {
            case 1:
                System.out.println("[1] = Domingo");
                break;
            case 2:
                System.out.println("[2] = Segunda-Feira");
                break;
            case 3:
                System.out.println("[3] = Terça-Feira");
                break;
            case 4:
                System.out.println("[4] = Quarta-Feira");
                break;
            case 5:
                System.out.println("[5] = Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("O numero digitado não corresponde a nenhum dia da semana.");
        }
        scanner.close();
    }
}