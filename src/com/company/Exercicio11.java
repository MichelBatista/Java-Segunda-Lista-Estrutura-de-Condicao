package com.company;

import java.util.Scanner;

/*
    As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver
    o programa que calculará os reajustes.

    Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
    salários até R$ 280,00 (incluindo) : aumento de 20%
    salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
    o salário antes do reajuste;
    o percentual de aumento aplicado;
    o valor do aumento;
    o novo salário, após o aumento.
 */

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        float salarioInformado = scanner.nextFloat();
        boolean salarioForAteDuzentosEOitenta = salarioInformado >= 0 && salarioInformado <= 280; //RECEBE AUMENTO DE 20%
        boolean salarioForEntreDuzentosEOitentaESetecentos = salarioInformado > 280 && salarioInformado <= 700; //RECEBE AUMENTO DE 15%
        boolean salarioForEntreSetecentosAMilEQuinhentos = salarioInformado > 700 && salarioInformado <= 1500; //RECEBE AUMENTO DE 10%
        boolean salarioMaiorQueMilEQuinhentos = salarioInformado > 1500; //RECEBE AUMENTO DE 5%
        System.out.println("===========================================================");
        if (salarioForAteDuzentosEOitenta) {
            double aumentoDeVintePorcento = (salarioInformado * 20)/ 100;
            double salarioComAumentoAplicado = salarioInformado + aumentoDeVintePorcento;
            System.out.println("O seu salario antes do reajuste era de: R$" + salarioInformado);
            System.out.println("O percentual de aumento aplicado foi de: 20%");
            System.out.println("O Valor do aumento foi de: R$" + aumentoDeVintePorcento);
            System.out.println("O novo salário após o aumento é de: R$" + salarioComAumentoAplicado);
        } else if (salarioForEntreDuzentosEOitentaESetecentos) {
            double aumentoDeQuinzePorcento = (salarioInformado * 15)/ 100;
            double salarioComAumentoAplicado = salarioInformado + aumentoDeQuinzePorcento;
            System.out.println("O seu salario antes do reajuste era de: R$" + salarioInformado);
            System.out.println("O percentual de aumento aplicado foi de: 15%");
            System.out.println("O Valor do aumento foi de: R$" + aumentoDeQuinzePorcento);
            System.out.println("O novo salário após o aumento é de: R$" + salarioComAumentoAplicado);
        } else if (salarioForEntreSetecentosAMilEQuinhentos) {
            double aumentoDeDezPorcento = (salarioInformado * 10)/ 100;
            double salarioComAumentoAplicado = salarioInformado + aumentoDeDezPorcento;
            System.out.println("O seu salario antes do reajuste era de: R$" + salarioInformado);
            System.out.println("O percentual de aumento aplicado foi de: 10%");
            System.out.println("O Valor do aumento foi de: R$" + aumentoDeDezPorcento);
            System.out.println("O novo salário após o aumento é de: R$" + salarioComAumentoAplicado);
        } else if (salarioMaiorQueMilEQuinhentos) {
            double aumentoDeCincoPorcento = (salarioInformado * 5)/ 100;
            double salarioComAumentoAplicado = salarioInformado + aumentoDeCincoPorcento;
            System.out.println("O seu salario antes do reajuste era de: R$" + salarioInformado);
            System.out.println("O percentual de aumento aplicado foi de: 5%");
            System.out.println("O Valor do aumento foi de: R$" + aumentoDeCincoPorcento);
            System.out.println("O novo salário após o aumento é de: R$" + salarioComAumentoAplicado);
        } else {
            System.out.println("Você digitou um salario invalido.");
        }
        scanner.close();
    }
}