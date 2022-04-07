package com.company;

import java.util.Scanner;

/*
    O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
    Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há
     limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um
      desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo
       usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo
        de pagamento, valor do desconto e valor a pagar.
                     Até 5 Kg           Acima de 5 Kg
        File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
        Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
        Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

 */

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha um tipo de carne\n[F] - File Duplu , [A] - Alcatra , [P] - Picanha: ");
        char tipoDeCarneEscolhidaPeloUsuario = scanner.next().charAt(0);
        boolean tipoDeCarneEscolhidaPeloUsuarioForValido = tipoDeCarneEscolhidaPeloUsuario == 'f' ||
                tipoDeCarneEscolhidaPeloUsuario == 'F' || tipoDeCarneEscolhidaPeloUsuario == 'a' ||
                tipoDeCarneEscolhidaPeloUsuario == 'A' || tipoDeCarneEscolhidaPeloUsuario == 'P' ||
                tipoDeCarneEscolhidaPeloUsuario == 'p';
        if (!tipoDeCarneEscolhidaPeloUsuarioForValido) {
            System.out.println("=========================================");
            System.out.println("O tipo de carne digitado não é valido!");
        } else {
            System.out.print("Digite a quantidade de KG's que deseja dess carne: ");
            int quantidadeDeKilosDeCarne = scanner.nextInt();
            double preçoTotal = 0;
            boolean tipoDeCarneForFileDuplo = tipoDeCarneEscolhidaPeloUsuario == 'f' || tipoDeCarneEscolhidaPeloUsuario == 'F';
            boolean tipoDeCarneForAlcatra = tipoDeCarneEscolhidaPeloUsuario == 'a' || tipoDeCarneEscolhidaPeloUsuario == 'A';
            boolean tipoDeCarneForPicanha = tipoDeCarneEscolhidaPeloUsuario == 'p' || tipoDeCarneEscolhidaPeloUsuario == 'P';
            if (tipoDeCarneForFileDuplo) {
                preçoTotal = quantidadeDeKilosDeCarne * 4.90;
            } else if (tipoDeCarneForAlcatra) {
                preçoTotal = quantidadeDeKilosDeCarne * 5.90;
            } else if (tipoDeCarneForPicanha) {
                preçoTotal = quantidadeDeKilosDeCarne * 6.90;
            }
            System.out.print("Qual forma de pagamento?\nC - [Cartão Tabajara] , N - [Norma]: ");
            char formaDePagamento = scanner.next().charAt(0);
            boolean formaDePagamentoForValida = formaDePagamento == 'C' || formaDePagamento == 'c' || formaDePagamento == 'N' || formaDePagamento == 'n';
            if (!formaDePagamentoForValida) {
                System.out.println("=========================================");
                System.out.println("A forma de pagamento não é valida.");
            } else {
                boolean formaDePagamentoNoCartaoTabajara = formaDePagamento == 'c' || formaDePagamento == 'C';
                double valorDoDesconto = 0;
                if (formaDePagamentoNoCartaoTabajara) {
                    //RECEBE DESCONTO DE 5% NA COMPRA
                    byte descontoDeCincoPorcento = 5;
                    valorDoDesconto = (preçoTotal * descontoDeCincoPorcento) / 100;
                    preçoTotal = preçoTotal - valorDoDesconto;
                }
                //tipo e quantidade de carne, preço total, tipo
                //        de pagamento, valor do desconto e valor a pagar.
                System.out.println("=========================================");
                if (tipoDeCarneForAlcatra) {
                    System.out.println("Tipo de Carne: [A] -Alcatra");
                } else if (tipoDeCarneForFileDuplo) {
                    System.out.println("Tipo de Carne: [F] - File Duplo");
                } else if (tipoDeCarneForPicanha) {
                    System.out.println("Tipo de Carne: [P] - Picanha");
                }
                System.out.println("Preço Total: " + (preçoTotal + valorDoDesconto));
                if (formaDePagamentoNoCartaoTabajara) {
                    System.out.println("Forma de Pagamento: [C] - Cartão Tabajara");
                    System.out.println("Valor do Desconto: R$" + valorDoDesconto);
                } else {
                    System.out.println("Forma de Pagamneto: [N] - Normal");
                    System.out.println("Não tem desconto.");
                }
                System.out.println("O preço total é de: R$" + preçoTotal);
                scanner.close();
            }
        }
    }
}