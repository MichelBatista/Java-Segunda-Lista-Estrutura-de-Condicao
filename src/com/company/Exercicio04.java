package com.company;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letraInformada = scanner.nextLine();
        System.out.println("=========================");
        if (letraInformada.length() == 1) {
            boolean letraForVogal = letraInformada.equals("a") || letraInformada.equals("A") || letraInformada.equals("e") ||
                    letraInformada.equals("E") || letraInformada.equals("i") || letraInformada.equals("I") || letraInformada.equals("o") ||
                    letraInformada.equals("O") || letraInformada.equals("u") || letraInformada.equals("U");
            if (letraForVogal) {
                System.out.println("A letra: [ " + letraInformada + " ] é uma VOGAL");
            } else {
                System.out.println("A letra: [ " + letraInformada + " ] é uma CONSOANTE");
            }
        } else {
            System.out.println("Você digitou mais de uma letra.");
        }
        scanner.close();
    }
}