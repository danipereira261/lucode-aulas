package br.com.magalu.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = scan.nextInt();

        System.out.println("Número antecessor: ");
        System.out.println(numero - 1);
    }
}
