package com.company;

import java.util.Scanner;

//Uma fruteira está vendendo frutas com a seguinte tabela de preços
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um
// desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade
// (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

public class Exercicio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos KG's de Morangos deseja comprar?: ");
        int quantidadeDeKilosDeMorango = scanner.nextInt();
        System.out.print("Quantos KG's de Morangos deseja comprar?: ");
        int quantidadeDeKilosDeMaças = scanner.nextInt();
        System.out.println("================================");
        double preçoTotalDoMorango = 0;
        double preçoTotalDaMaça = 0;
        boolean quantidadeDeKilosDeMorangosForMenorOuIgualCinco = quantidadeDeKilosDeMorango >= 0 || quantidadeDeKilosDeMorango <= 5;
        boolean quantidadeDeKilosDeMaçasForMenorOuIgualCinco = quantidadeDeKilosDeMorango >= 0 || quantidadeDeKilosDeMorango <= 5;
        if (quantidadeDeKilosDeMorangosForMenorOuIgualCinco) {
            preçoTotalDoMorango = quantidadeDeKilosDeMorango * 2.50;
        } else {
            preçoTotalDoMorango = quantidadeDeKilosDeMorango * 2.20;
        }
        if (quantidadeDeKilosDeMaçasForMenorOuIgualCinco) {
            preçoTotalDaMaça = quantidadeDeKilosDeMaças * 1.80;
        } else {
            preçoTotalDaMaça = quantidadeDeKilosDeMaças * 1.50;
        }
        double preçoTotal = preçoTotalDoMorango + preçoTotalDaMaça;
        double quantidadeDeKilosDeFrutaNoTotal = quantidadeDeKilosDeMaças + quantidadeDeKilosDeMaças;
        boolean quantidadeDeKilosDeFrutaNoTotalForMaiorQueOito = quantidadeDeKilosDeFrutaNoTotal > 8;
        boolean oPreçoTotalUltrapassarDeVinteECincoReais = preçoTotal > 25;
        if (quantidadeDeKilosDeFrutaNoTotalForMaiorQueOito || oPreçoTotalUltrapassarDeVinteECincoReais) {
            byte descontoDeDezPorcento = 10;
            double valorDoDesconto = (preçoTotal * descontoDeDezPorcento) / 100;
            preçoTotal = preçoTotal - valorDoDesconto;
        }
        System.out.println("O valor a ser pago é de: R$" + preçoTotal);
        scanner.close();
    }
}