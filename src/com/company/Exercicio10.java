package com.company;

import java.util.Scanner;

//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu turno\n[M] - Matutino , [V] - Vespertino , N - [Noturno]: ");
        char turnoInformado = scanner.next().charAt(0);
        System.out.println("=========================");
        boolean turnoInformadoForMatutino = turnoInformado == 'M' || turnoInformado == 'm';
        boolean turnoInformadoForVespertino = turnoInformado == 'V' || turnoInformado == 'v';
        boolean turnoInformadoForNoturno = turnoInformado == 'N' || turnoInformado == 'n';
        if (turnoInformadoForMatutino) {
            System.out.println("Bom dia!");
        } else if (turnoInformadoForVespertino) {
            System.out.println("Boa tarde!");
        } else if (turnoInformadoForNoturno) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("O turno informado é invalido.");
        }
        scanner.close();
    }
}