package com.company;

import java.util.Scanner;

/*
    Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
    e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo

    Entre 9.0 e 10.0        A
    Entre 7.5 e 9.0         B
    Entre 6.0 e 7.5         C
    Entre 4.0 e 6.0         D
    Entre 4.0 e zero        E
 */

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        float primeiraNota = scanner.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        float segundaNota = scanner.nextFloat();
        byte quantidadeDeNotas = 2;
        float mediaDasNotas = (primeiraNota + segundaNota) / quantidadeDeNotas;
        boolean mediaForEntreNoveEDez = mediaDasNotas >= 9 && mediaDasNotas <= 10; // A
        boolean mediaForMaiorOuIgualASeteEMeioEMenorQueNove = mediaDasNotas >= 7.5 && mediaDasNotas < 9; // B
        boolean mediaForMaiorOuIgualASeisEMenorQueSeteEMeio = mediaDasNotas >= 6 && mediaDasNotas < 7.5; // C
        boolean mediaForMaiorOuIgualAQuatroEMenorQueSeis = mediaDasNotas >= 4 && mediaDasNotas < 6; // D
        boolean mediaForMaiorOuIgualAZeroEMenorQueQuatro = mediaDasNotas >= 0 && mediaDasNotas < 4; // E
        System.out.println("=====================================");
        if (mediaForEntreNoveEDez) {
            System.out.println("Primeira nota = " + primeiraNota + "\nSegunda nota = " + segundaNota + "\n" +
                    "Sua média foi de: " + mediaDasNotas + "\nVocê recebeu um A (APROVADO)");
        } else if (mediaForMaiorOuIgualASeteEMeioEMenorQueNove) {
            System.out.println("Primeira nota = " + primeiraNota + "\nSegunda nota = " + segundaNota + "\n" +
                    "Sua média foi de: " + mediaDasNotas + "\nVocê recebeu um B (APROVADO)");
        } else if (mediaForMaiorOuIgualASeisEMenorQueSeteEMeio) {
            System.out.println("Primeira nota = " + primeiraNota + "\nSegunda nota = " + segundaNota + "\n" +
                    "Sua média foi de: " + mediaDasNotas + "\nVocê recebeu um C (APROVADO)");
        } else if (mediaForMaiorOuIgualAQuatroEMenorQueSeis) {
            System.out.println("Primeira nota = " + primeiraNota + "\nSegunda nota = " + segundaNota + "\n" +
                    "Sua média foi de: " + mediaDasNotas + "\nVocê recebeu um D (REPROVADO)");
        } else if (mediaForMaiorOuIgualAZeroEMenorQueQuatro) {
            System.out.println("Primeira nota = " + primeiraNota + "\nSegunda nota = " + segundaNota + "\n" +
                    "Sua média foi de: " + mediaDasNotas + "\nVocê recebeu um E (REPROVADO)");
        } else {
            System.out.println("Você informou uma nota invalida.");
        }
        scanner.close();
    }
}