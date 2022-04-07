package com.company;

import java.util.Scanner;

//Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque
// e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 10, 50
// e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade
// de notas existentes na máquina.

//Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50,
// uma nota de 5 e uma nota de 1;

//Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50,
// quatro notas de 10, e nove notas de 1.

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do saque: ");
        int valorDoSaque = scanner.nextInt();
        int quantidadeDeNotasDeCem = ((valorDoSaque - (valorDoSaque % 100)) / 100);
        int quantidadeDeNotasDeCinquenta = ((valorDoSaque % 100) / 50);
        int quantidadeDeNotasDeDez = (((valorDoSaque % 50) / 10));
        int quantidadeDeNotasDeUm = valorDoSaque % 10;
        boolean quantidadeDeNotasDeCemForMaiorOuIgualQueUm = quantidadeDeNotasDeCem >= 1;
        boolean quantidadeDeNotasDeCinquentaForMaiorOuIgualQueUm = quantidadeDeNotasDeCem >= 1;
        boolean quantidadeDeNotasDeDezForMaiorOuIgualQueUm = quantidadeDeNotasDeCem >= 1;
        boolean quantidadeDeNotasDeUmForMaiorOuIgualQueUm = quantidadeDeNotasDeCem >= 1;
        System.out.println("==============================");
        if (quantidadeDeNotasDeCemForMaiorOuIgualQueUm) {
            System.out.println(quantidadeDeNotasDeCem + " nota(s) de R$100");
        }
        if (quantidadeDeNotasDeCinquentaForMaiorOuIgualQueUm) {
            System.out.println(quantidadeDeNotasDeCinquenta + " nota(s) de R$50");
        }
        if (quantidadeDeNotasDeDezForMaiorOuIgualQueUm) {
            System.out.println(quantidadeDeNotasDeDez + " nota(s) de R$10");
        }
        if (quantidadeDeNotasDeUmForMaiorOuIgualQueUm) {
            System.out.println(quantidadeDeNotasDeUm + " nota(s) de R$1");
        }
        scanner.close();
    }
}