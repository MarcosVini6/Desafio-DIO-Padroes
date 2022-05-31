package br.com.livraria.models;

public class Autor {

    int idAutor;
    String nomeAutor;
public Autor(String nomeAutor){

    this.idAutor++;
    this.nomeAutor = nomeAutor;

}
    public int getIdAutor() {
        return idAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;

    }
    @Override
    public String toString() {
        return  nomeAutor;
    }
}
