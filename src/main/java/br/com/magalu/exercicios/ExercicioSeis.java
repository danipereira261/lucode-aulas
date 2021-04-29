package br.com.magalu.exercicios;

import java.util.Scanner;

public class ExercicioSeis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        float base = scan.nextFloat();

        System.out.println("Digite a altura do retângulo: ");
        float altura = scan.nextFloat();

        System.out.println("Dimensões do retângulo: ");
        System.out.println(obterDimensao(base, altura));
    }

    private static float obterDimensao(float base, float altura) {
        return base * altura;
    }
}
