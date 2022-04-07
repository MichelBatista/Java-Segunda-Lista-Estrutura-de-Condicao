package com.company;

import java.util.Scanner;

/*
Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool: até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro
Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número de litros vendidos, o tipo
de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
 */

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe quantos litros de Alcool deseja: ");
        double quantidadeDeAlcoolEmLitros = scanner.nextDouble();
        System.out.print("Informe quantos litros de Gasolina deseja: ");
        double quantidadeDeGasolinaEmLitros = scanner.nextDouble();
        System.out.println("==============================");
        double preçoDoAlcool = 1.90 * quantidadeDeAlcoolEmLitros;
        double preçoDaGasolina = 2.50 * quantidadeDeGasolinaEmLitros;
        boolean quantidadeDeAlcoolForAteVinteLitros = quantidadeDeAlcoolEmLitros > 0 && quantidadeDeAlcoolEmLitros <= 20;
        boolean quantidadeDeGasolinaForAteVinteLitros = quantidadeDeGasolinaEmLitros > 0 && quantidadeDeGasolinaEmLitros <= 20;
        boolean quantidadeDeAlcoolForMaiorQueVinteLitros = quantidadeDeAlcoolEmLitros > 20;
        boolean quantidadeDeGasolinaForMaiorQueVinteLitros = quantidadeDeAlcoolEmLitros > 20;
        if (quantidadeDeAlcoolForAteVinteLitros) {
            double desconto = 3; //PORCENTO
            double descontoDoPreçoDoAlcool = (preçoDoAlcool * desconto) / 100;
            double preçoAPagar = preçoDoAlcool - descontoDoPreçoDoAlcool;
            System.out.printf("A - Alcool: R$%.2f", preçoAPagar);
            System.out.println();
        } else if (quantidadeDeAlcoolForMaiorQueVinteLitros) {
            int desconto = 5; //PORCENTO
            double preçoComDescontoDoAlcool = (preçoDoAlcool * desconto) / 100;
            double preçoAPagar = preçoDoAlcool - preçoComDescontoDoAlcool;
            System.out.printf("A - Alcool: R$%.2f", preçoAPagar);
            System.out.println();
        } else {
            System.out.println("Você informou a quantidade de litros de alcool invalido.");
        }
        if (quantidadeDeGasolinaForAteVinteLitros) {
            int desconto = 4; //PORCENTO
            double preçoComDescontoDaGasolina = (preçoDaGasolina * desconto) / 100;
            double preçoAPagar = preçoDoAlcool - preçoComDescontoDaGasolina;
            System.out.printf("G - Gasolina: R$%.2f", preçoAPagar);
        } else if (quantidadeDeGasolinaForMaiorQueVinteLitros) {
            int desconto = 6; //PORCENTO
            double preçoComDescontoDaGasolina = (preçoDaGasolina * desconto) / 100;
            double preçoAPagar = preçoDoAlcool - preçoComDescontoDaGasolina;
            System.out.printf("G - Gasolina: R$%.2f", preçoAPagar);
        } else {
            System.out.println("Você informou a quantidade de litros de gasolina invalida.");
        }
        scanner.close();
    }
}