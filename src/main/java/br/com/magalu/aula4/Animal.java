package br.com.magalu.aula4;

public class Animal implements ComportamentoAnimal {

    private String nomeCientifico;
    private String genero;
    private Double peso;
    private String especie;
    private Temperamento temperamento;

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Temperamento getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(Temperamento temperamento) {
        this.temperamento = temperamento;
    }

    @Override
    public void comer() {

    }

    @Override
    public void movimentar() {

    }

    @Override
    public void procriar() {

    }

    @Override
    public void emitirSom() {

    }
}
