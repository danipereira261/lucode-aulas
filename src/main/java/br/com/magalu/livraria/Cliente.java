package br.com.magalu.livraria;

public class Cliente {

    public String nome;
    public String matricula;


    public Cliente() {
    }

    public Cliente(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }



    //Um cliente não pode estar com mais de 2 livros
    // não pode haver dois alugueis
    // para o mesmo livro ao mesmo tempo
    // cliente deve ter nome, matricula e lista de livros
}
