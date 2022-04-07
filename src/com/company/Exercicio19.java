package com.company;

import java.util.Scanner;

//Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
//Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
//326 = 3 centenas, 2 dezenas e 6 unidades
//12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SOMENTO DE 1 A 999\n====================");
        System.out.print("Informe um numero: ");
        int numeroInformado = scanner.nextInt();
        if (numeroInformado >= 1 && numeroInformado <= 999) {
            int unidadeDoNumeroInformado = (numeroInformado % 10);
            int numeroInforamdoMenosUnidade = numeroInformado - unidadeDoNumeroInformado;
            int numeroInforamdoMenosUnidadeDivididoPorDez = numeroInforamdoMenosUnidade / 10;
            int dezenaDoNumeroInformado = numeroInforamdoMenosUnidadeDivididoPorDez % 10;
            int centenaDoNumeroInformado = (numeroInforamdoMenosUnidadeDivididoPorDez - dezenaDoNumeroInformado) / 10;
            System.out.println("====================");
            System.out.println(centenaDoNumeroInformado + " centena(s) , " + dezenaDoNumeroInformado + " dezena(s) , " +
                    unidadeDoNumeroInformado + " unidade(s)");
        } else {
            System.out.println("O numero informado está fora do limite.");
        }
        scanner.close();
    }
}