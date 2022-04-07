package com.company;

import java.util.Scanner;

//Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int anoInformado = scanner.nextInt();
        System.out.println("==============================================");
        boolean anoInformadoForBissexto = (anoInformado % 4 == 0 & anoInformado % 100 != 0) || (anoInformado % 400 == 0);
        if (anoInformadoForBissexto) {
            System.out.println("O ano informado é bissexto.");
        } else {
            System.out.println("O ano informado não é bissexto.");
        }
        scanner.close();
    }
}