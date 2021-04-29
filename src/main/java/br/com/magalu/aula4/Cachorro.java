package br.com.magalu.aula4;

public class Cachorro extends Animal {

    private String nome;
    private String nomeDoDono;
    private String genero;
    private Double peso;

    public Cachorro() {
    }

    public Cachorro(String nome, String nomeDoDono, String genero, Double peso) {
        this.nome = nome;
        this.nomeDoDono = nomeDoDono;
        this.genero = genero;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public Double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
