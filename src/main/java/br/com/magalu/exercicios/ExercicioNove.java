package br.com.magalu.exercicios;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        Double salarioAtual = scan.nextDouble();

        System.out.println("Digite o percentual de reajuste: ");
        Double percentualDeReajuste = scan.nextDouble();

        Double reajuste = salarioAtual * percentualDeReajuste;
        System.out.println("Valor de Reajuste R$ " + reajuste );
        System.out.println("Salário Reajuste R$ " + (salarioAtual + reajuste ));

    }
    }

