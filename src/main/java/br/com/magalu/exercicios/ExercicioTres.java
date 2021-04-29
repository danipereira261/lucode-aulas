package br.com.magalu.exercicios;

public class ExercicioTres {
    public static void main(String[] args) {

        //Exercicio A
        float resultadoA1 = (4 / 2) + (2 / 4);
        float resultadoA2 = 4 / 2 + 2 / 4;

        System.out.println("Resultado: " + resultadoA1);
        System.out.println("Resultado: " + resultadoA2);

        if (resultadoA1 == resultadoA2) {
            System.out.println("valores iguais");
        } else {
            System.out.println("valores diferentes");
        }
        //---------------------------------------------------------------------------------------

        //Exercicio B
        float resultadoB1 = 4 / (2 + 2) / 4;
        float resultadoB2 = 4 / 2 + 2 / 4;

        System.out.println("Resultado: " + resultadoB1);
        System.out.println("Resultado: " + resultadoB2);

        if (resultadoB1 == resultadoB2) {
            System.out.println("valores iguais");
        } else {
            System.out.println("valores diferentes");
        }
        //---------------------------------------------------------------------------------------

        //Exercicio C
        float resultadoC1 = (4 + 2) * 2 - 4;
        float resultadoC2 = 4 + 2 * 2 - 4;

        System.out.println("Resultado: " + resultadoC1);
        System.out.println("Resultado: " + resultadoC2);

        if (resultadoB1 == resultadoB2) {
            System.out.println("valores iguais");
        } else {
            System.out.println("valores diferentes");
        }

    }
}
