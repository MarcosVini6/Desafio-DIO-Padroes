package br.com.livraria.models;


public class Livro {
    int id;
    String nome;
    Genero genero;
    Autor autor;
    double preco;

    public Livro(String nomeLivro, double preco, Autor autor, Genero genero) {
        this.id++;
        this.nome = nomeLivro;
        this.preco = preco;
        this.autor = autor;
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public int getIdLivro() {
        return id;
    }

    public String getNomeLivro() {
        return nome;
    }

    public Genero getGeneroLivro() {
        return genero;
    }

    public Autor getAutorLivro() {
        return autor;
    }

    @Override
    public String toString() {
        return "nome: " + nome + " preço: " + preco + " genero: " + genero + " autor: " + autor;
    }
}
