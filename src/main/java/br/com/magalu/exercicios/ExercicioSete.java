package br.com.magalu.exercicios;

import java.util.Scanner;

public class ExercicioSete {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade em anos: ");
        int idade = scan.nextInt();

        System.out.println("Idade em meses: ");
        System.out.println(multiplicar(idade, 12));

        System.out.println("Idade em dias: ");
        System.out.println(multiplicar(idade, 365));

    }

    private static int multiplicar(int idade, int i) {
        return idade * i;
    }
}
