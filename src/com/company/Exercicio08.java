package com.company;

import java.util.Scanner;

//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a
// decisão é sempre pelo mais barato.

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do primeiro produto: ");
        float preçoDoPrimeiroProduto = scanner.nextFloat();
        System.out.print("Digite o preço do segundo produto: ");
        float preçoDoSegundoProduto = scanner.nextFloat();
        System.out.print("Digite o preço do teceiro produto: ");
        float preçoDoTerceiroProduto = scanner.nextFloat();
        System.out.println("=====================================");
        boolean primeiroProdutoMaisBarato = preçoDoPrimeiroProduto < preçoDoSegundoProduto &&
                preçoDoPrimeiroProduto < preçoDoTerceiroProduto;
        boolean segundoProdutoMaisBarato = preçoDoSegundoProduto < preçoDoPrimeiroProduto &&
                preçoDoSegundoProduto < preçoDoTerceiroProduto;
        if (primeiroProdutoMaisBarato) {
            System.out.println("Você deve comprar o primeiro produto. Que vale: R$" + preçoDoPrimeiroProduto);
        } else if (segundoProdutoMaisBarato) {
            System.out.println("Você deve comprar o segundo produto. Que vale: R$" + preçoDoSegundoProduto);
        } else {
            System.out.println("Você deve comprar o terceiro produto. Que vale: R$" + preçoDoTerceiroProduto);
        }
        scanner.close();
    }
}