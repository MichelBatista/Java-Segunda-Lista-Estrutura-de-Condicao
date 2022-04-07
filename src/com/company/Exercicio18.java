package com.company;

import java.util.Scanner;

//Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

//31 dias
//
//01 03 05 07 08 10 12
//
//30 dias
//
//04 06 09 11
//
//28 dias
//
//fevereiro

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        byte diaInformado = scanner.nextByte();
        System.out.print("Digite o mês: ");
        byte mesInformado = scanner.nextByte();
        System.out.print("Digite o ano: ");
        short anoInformado = scanner.nextShort();
        boolean dataValida = false;
        boolean anoValido = (anoInformado > 1500) && (anoInformado <= 2500);
        boolean mesComTrintaEUmDias = (mesInformado == 1) || (mesInformado == 3) || (mesInformado == 5) ||
                (mesInformado == 7) || (mesInformado == 8) || (mesInformado == 10) || (mesInformado == 12);
        boolean mesComTrintaDias = (mesInformado == 4) || (mesInformado == 6) || (mesInformado == 9) || (mesInformado == 11);
        boolean diaForAteTrintaEUmDias = diaInformado >= 1 && diaInformado <= 31;
        boolean diaForAteTrintaDias = diaInformado >= 1 && diaInformado <= 30;
        boolean diaForAteVinteENoveDias = diaInformado >= 1 && diaInformado <= 29;
        boolean diaForAteVinteEOitoDias = diaInformado >= 1 && diaInformado <= 28;
        boolean mesComVinteEOitoDias = (mesInformado == 2);
        boolean anoBissexto = (anoInformado % 400 == 0) || ((anoInformado % 4 == 0) && (anoInformado % 100 != 0));
        if (anoValido) {
            if (mesComTrintaEUmDias) {
                if (diaForAteTrintaEUmDias) {
                    dataValida = true;
                }
            } else if (mesComTrintaDias) {
                if (diaForAteTrintaDias) {
                    dataValida = true;
                }
            } else if (mesComVinteEOitoDias) {
                if (anoBissexto) {
                    if (diaForAteVinteENoveDias) {
                        dataValida = true;
                    }
                } else {
                    if (diaForAteVinteEOitoDias) {
                        dataValida = true;
                    }
                }
            }
        }
        System.out.println("============================================");
        if (dataValida == true) {
            System.out.println("Data Valida");
        } else {
            System.out.println("Data Invalida");
        }
        scanner.close();
    }
}