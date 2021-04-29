package br.com.magalu.aula6;

public class MainData {

    public static void main(String[] args) {

        Data data = new Data();
        data.setDia("26");
        data.setMes("01");
        data.setAno("1988");

        System.out.println(data.compara(new Data("26", "01", "1988")));
    }
}

