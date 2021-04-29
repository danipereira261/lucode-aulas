package br.com.magalu.aula6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {

    private String dia;
    private String mes;
    private String mesExtenso;
    private String ano;

    public Data() {

    }

    public Data(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int compara(Data data) {
        String dataInputada = data.dia.concat("/").concat(mes).concat("/").concat(ano);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate ld = LocalDate.parse(dataInputada, formatter);
        LocalDate agora = LocalDate.now();

        if (ld.equals(agora)) {
            return 0;
        } else if (ld.isBefore(agora)) {
            return 1;
        } else {
            return -1;
        }
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setMesExtenso(String mesExtenso) {
        this.mesExtenso = mesExtenso;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}

