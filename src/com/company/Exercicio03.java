package com.company;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M -
// Masculino, Sexo Inválido.

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu genero, [M] - Masculino , [F] - Feminino: ");
        char generoInformado = scanner.next().charAt(0);
        System.out.println("=========================");
        boolean generoInformadoForMasculino = generoInformado == 'm' || generoInformado == 'M';
        boolean generoInformadoForFeminino = generoInformado == 'f' || generoInformado == 'F';
        if (generoInformadoForMasculino) {
            System.out.println("Masculino");
        } else if (generoInformadoForFeminino) {
            System.out.println("Feminino");
        } else {
            System.out.println("Genero Invalido");
        }
        scanner.close();
    }
}