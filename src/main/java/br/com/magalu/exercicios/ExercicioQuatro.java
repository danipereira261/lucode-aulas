package br.com.magalu.exercicios;

public class ExercicioQuatro {

    public static void main(String[] args) {

        System.out.println("Exercicio A: " + multiplicar(6, somar(3, 2)));
        System.out.println("Exercicio B: " + somar(2, multiplicar(6, somar(3, 2))));
        System.out.println("Exercicio C: " + somar(2, dividir(multiplicar(3, 6), somar(2, 4))));
        System.out.println("Exercicio D: " + multiplicar(2, dividir(8, somar(3, 1))));
        System.out.println("Exercicio F: " + somar(dividir(6, 3), dividir(8, 2)));
        System.out.println("Exercicio G: " + somar(multiplicar(somar(3, dividir(8, 2)), 4), multiplicar(3, 2)));
        System.out.println("Exercicio H: " + subtrair(somar(multiplicar(6, multiplicar(3, 3)), 6), 10));
        System.out.println("Exercicio I: " + multiplicar(somar(multiplicar(10, 8), 3), 9));
        System.out.println("Exercicio J: "+ somar(multiplicar(-12,-4),multiplicar(3,-4)));
    }

    public static int somar(int valorUm, int valorDois) {

        return valorUm + valorDois;
    }

    public static int subtrair(int valorUm, int valorDois) {

        return valorUm - valorDois;
    }

    public static int dividir(int valorUm, int valorDois) {

        return valorUm / valorDois;
    }

    public static int multiplicar(int valorUm, int valorDois) {

        return valorUm * valorDois;
    }
}




