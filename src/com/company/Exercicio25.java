package com.company;

import java.util.Scanner;

//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//"Telefonou para a vítima?"
//"Esteve no local do crime?"
//"Mora perto da vítima?"
//"Devia para a vítima?"
//"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa
// no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4
// como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Você telefonou para a vitima? [S] - Sim ou [N] - Não: ");
        String respostaDaPrimeiraPergunta = scanner.nextLine();
        System.out.print("Você esteve no local do crime? [S] - Sim ou [N] - Não: ");
        String respostaDaSegundaPergunta = scanner.nextLine();
        System.out.print("Você morava perto da vitima? [S] - Sim ou [N] - Não: ");
        String respostaDaTerceiraPergunta = scanner.nextLine();
        System.out.print("Você devia para a vitima? [S] - Sim ou [N] - Não: ");
        String respostaDaQuartaPergunta = scanner.nextLine();
        System.out.print("Você ja trabalhou com a vitima? [S] - Sim ou [N] - Não: ");
        String respostaDaQuintaPergunta = scanner.nextLine();
        System.out.println("============================================");
        int quantidadeDeRespostasSim = 0;
        boolean primeiraRespostaForSim = respostaDaPrimeiraPergunta.equals("s") || respostaDaPrimeiraPergunta.equals("S");
        boolean segundaRespostaForSim = respostaDaSegundaPergunta.equals("s") || respostaDaSegundaPergunta.equals("S");
        boolean terceiraRespostaForSim = respostaDaTerceiraPergunta.equals("s") || respostaDaTerceiraPergunta.equals("S");
        boolean quartaRespostaForSim = respostaDaQuartaPergunta.equals("s") || respostaDaQuartaPergunta.equals("S");
        boolean quintaRespostaForSim = respostaDaQuintaPergunta.equals("s") || respostaDaQuintaPergunta.equals("S");
        if (primeiraRespostaForSim) {
            quantidadeDeRespostasSim = quantidadeDeRespostasSim + 1;
        }
        if (segundaRespostaForSim) {
            quantidadeDeRespostasSim = quantidadeDeRespostasSim + 1;
        }
        if (terceiraRespostaForSim) {
            quantidadeDeRespostasSim = quantidadeDeRespostasSim + 1;
        }
        if (quartaRespostaForSim) {
            quantidadeDeRespostasSim = quantidadeDeRespostasSim + 1;
        }
        if (quintaRespostaForSim) {
            quantidadeDeRespostasSim = quantidadeDeRespostasSim + 1;
        }
        boolean participanteForSuspeito = quantidadeDeRespostasSim == 2;
        boolean participandoForCumplice = quantidadeDeRespostasSim >= 3 && quantidadeDeRespostasSim <= 4;
        boolean participandoForOAssasino = quantidadeDeRespostasSim == 5;
        if (participanteForSuspeito) {
            System.out.println("Você é SUSPEITO(A)");
        } else if (participandoForCumplice) {
            System.out.println("Você é CUMPLICE");
        } else if (participandoForOAssasino) {
            System.out.println("Você é o ASSASINO(A)");
        } else {
            System.out.println("Você é INOCENTE");
        }
        scanner.close();
    }
}