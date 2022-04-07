package com.company;

import java.util.Scanner;

/*
    Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende
    do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é
    descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos.
    O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

    Desconto do IR:
    Salário Bruto até 900 (inclusive) - isento
    Salário Bruto até 1500 (inclusive) - desconto de 5%
    Salário Bruto até 2500 (inclusive) - desconto de 10%
    Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo.
    No exemplo o valor da hora é 5 e a quantidade de hora é 220.

 */

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor da sua hora trabalhada: ");
        float valorDaHoraTrabalhada = scanner.nextFloat();
        System.out.print("Informe a quantidade de horas trabalhadas no dia: ");
        float quantidadeDeHorasTrabalhadasNoDia = scanner.nextFloat();
        float quantidadeDeDiasTrabalhadosNoMes = 22;
        float quantidadeDeHorasTrabalhadasNoMes = quantidadeDeHorasTrabalhadasNoDia * quantidadeDeDiasTrabalhadosNoMes;
        float salarioBruto = valorDaHoraTrabalhada * quantidadeDeHorasTrabalhadasNoMes;
        boolean salarioForAteNovecentosReais = salarioBruto >= 0 && salarioBruto <= 900; //NAO PAGA IMPOSTO DE RENDA
        boolean salarioForMaiorQueNovecentosAteMilEQuinhentos = salarioBruto > 900 && salarioBruto <= 1500; //PAGA 5% DE DESCONTO AO IMPOSTO DE RENDA
        boolean salarioForMaiorQueMilEQuinhentosAteDoisMilEQuinhentos = salarioBruto > 1500 && salarioBruto <= 2500; //PAGA 10% DE DESCONTO AO IMPOSTO DE RENDA
        boolean salarioForMaiorQueDoisMilEQuinhentos = salarioBruto > 2500; //PAGA 20% DE DESCONTO AO IMPOSTO DE RENDA
        float descontoImpostoDeRenda = 0;
        if (salarioForMaiorQueNovecentosAteMilEQuinhentos) {
            descontoImpostoDeRenda = (salarioBruto * 5) / 100;
        } else if(salarioForMaiorQueMilEQuinhentosAteDoisMilEQuinhentos) {
            descontoImpostoDeRenda = (salarioBruto * 10) / 100;
        } else if (salarioForMaiorQueDoisMilEQuinhentos) {
            descontoImpostoDeRenda = (salarioBruto * 20) / 100;
        }
        float descontoINSS = (salarioBruto * 10) / 100;
        float valorDoFGTS = (salarioBruto * 11) / 100;
        float totalDeDescontos = descontoImpostoDeRenda + descontoINSS;
        float salarioLiquido = salarioBruto - totalDeDescontos;
        System.out.println("============================================================");
        if (salarioForAteNovecentosReais) {
            System.out.println("Salário Bruto:               R$" + salarioBruto);
            System.out.println("(-) Imposto de Renda (0%):   R$" + descontoImpostoDeRenda);
            System.out.println("(-) INSS (10%):              R$" + descontoINSS);
            System.out.println("FGTS (11%)                   R$" + valorDoFGTS);
            System.out.println("Total de Descontos:          R$" + totalDeDescontos);
            System.out.println("Salário Liquido:             R$" + salarioLiquido);
        } else if (salarioForMaiorQueNovecentosAteMilEQuinhentos) {
            System.out.println("Salário Bruto:               R$" + salarioBruto);
            System.out.println("(-) Imposto de Renda (5%):   R$" + descontoImpostoDeRenda);
            System.out.println("(-) INSS (10%):              R$" + descontoINSS);
            System.out.println("FGTS (11%)                   R$" + valorDoFGTS);
            System.out.println("Total de Descontos:          R$" + totalDeDescontos);
            System.out.println("Salário Liquido:             R$" + salarioLiquido);
        } else if (salarioForMaiorQueMilEQuinhentosAteDoisMilEQuinhentos) {
            System.out.println("Salário Bruto:                R$" + salarioBruto);
            System.out.println("(-) Imposto de Renda (10%):   R$" + descontoImpostoDeRenda);
            System.out.println("(-) INSS (10%):               R$" + descontoINSS);
            System.out.println("FGTS (11%)                    R$" + valorDoFGTS);
            System.out.println("Total de Descontos:           R$" + totalDeDescontos);
            System.out.println("Salário Liquido:              R$" + salarioLiquido);
        } else if (salarioForMaiorQueDoisMilEQuinhentos) {
            System.out.println("Salário Bruto:                R$" + salarioBruto);
            System.out.println("(-) Imposto de Renda (20%):   R$" + descontoImpostoDeRenda);
            System.out.println("(-) INSS (10%):               R$" + descontoINSS);
            System.out.println("FGTS (11%)                    R$" + valorDoFGTS);
            System.out.println("Total de Descontos:           R$" + totalDeDescontos);
            System.out.println("Salário Liquido:              R$" + salarioLiquido);
        } else {
            System.out.println("Você informou algum dado invalido, refaça o programa corretamente.");
        }
        scanner.close();
    }
}