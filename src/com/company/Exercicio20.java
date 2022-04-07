package com.company;

import java.util.Scanner;

//Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
//A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
//A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
//A mensagem "Aprovado com Distinção", se a média for igual a 10.

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float primeiraNota = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float segundaNota = scanner.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float terceiraNota = scanner.nextFloat();
        byte quantidadeDeNotas = 3;
        float mediaAlcançada = (primeiraNota + segundaNota + terceiraNota) / quantidadeDeNotas;
        boolean mediaDoAlunoForDez = mediaAlcançada == 10;
        boolean mediaDoAlunoForMaiorOuIgualSete = mediaAlcançada >= 7 && mediaAlcançada < 10;
        boolean mediaDoAlunoMenorQueSete = mediaAlcançada >= 0 && mediaAlcançada < 7;
        System.out.println("==============================");
        if (mediaDoAlunoForDez) {
            System.out.printf("Média: %.2f", mediaAlcançada);
            System.out.println("\nParabéns APROVADO com DINSTINÇÃO!!!");
        } else if (mediaDoAlunoForMaiorOuIgualSete) {
            System.out.printf("Média: %.2f", mediaAlcançada);
            System.out.println("\nParabéns APROVADO!!!");
        } else if (mediaDoAlunoMenorQueSete) {
            System.out.printf("Média: %.2f", mediaAlcançada);
            System.out.println("\nREPROVADO, estude mais.");
        } else {
            System.out.println("Você inseriu alguma nota invalida. Refaça o programa novamente.");
        }
        scanner.close();
    }
}