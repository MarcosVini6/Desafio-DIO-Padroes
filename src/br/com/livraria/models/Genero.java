package br.com.livraria.models;

public class Genero {
    int idGenero;
    String nomeGenero;

    public Genero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public String getNomeGenero() {
        return nomeGenero;
    }
    @Override
    public String toString() {
        return  nomeGenero ;
    }
}

