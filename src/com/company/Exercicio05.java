package com.company;

import java.util.Scanner;

//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float primeiraNota = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float segundaNota = scanner.nextFloat();
        System.out.println("=========================");
        byte quantidadeDeNotas = 2;
        float mediaDoAluno = (primeiraNota + segundaNota) / quantidadeDeNotas;
        boolean mediaDoAlunoForDez = mediaDoAluno == 10;
        boolean mediaDoAlunoForMaiorOuIgualASeteEMenorQueDez = mediaDoAluno >= 7 && mediaDoAluno < 10;
        boolean mediaDoAlunoForMaiorQueZeroEMenorQueSete = mediaDoAluno >= 0 && mediaDoAluno < 7;
        if (mediaDoAlunoForDez) {
            System.out.println("Parabéns!!! Você foi APROVADO com DISTINÇÃO");
            System.out.println("Sua média foi de: " + mediaDoAluno);
        } else if (mediaDoAlunoForMaiorOuIgualASeteEMenorQueDez) {
            System.out.println("Parabéns!!! Você foi APROVADO");
            System.out.println("Sua média foi de: " + mediaDoAluno);
        } else if (mediaDoAlunoForMaiorQueZeroEMenorQueSete) {
            System.out.println("Você não alcançou a média desejada. REPROVADO");
            System.out.println("Sua média foi de: " + mediaDoAluno);
        } else {
            System.out.println("Você informou alguma das notas invalida.");
        }
        scanner.close();
    }
}