package br.com.magalu.exercicios;

import java.util.Scanner;

public class ExercicioOnze {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de carros vendidos: ");
        Double totalCarrosVendidos = scan.nextDouble();

        System.out.println("Digite a comissão fixa por cada carro vendido: ");
        Double comissaoFixa = scan.nextDouble();

        System.out.println("Digite o valor total de vendas R$ : ");
        Double valortotaldeVendas = scan.nextDouble();

        System.out.println("Percentual de vendas % : ");
        Double percentualDeVendas = scan.nextDouble();

        System.out.println("Digite o salário fixo R$ : ");
        Double salarioFixo = scan.nextDouble();

        System.out.println("Salário final do vendedor R$ " +
                (multiplicacao(comissaoFixa, totalCarrosVendidos) +
                        multiplicacao(valortotaldeVendas, percentualDeVendas) +
                        salarioFixo));
    }

    private static double multiplicacao(double x, double y) {
        return x * y;
    }
}
