package br.com.livraria.models;

import java.util.List;

public class AcervoLivros {
    List<Livro>livros;

    public AcervoLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionar(Livro livro) {
        this.livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }
    public Livro buscarPorId(int id) throws Exception {
        for (Livro item:this.livros ) {
            if (item.id==id)
                return item;
        }
        throw new Exception("Livro não encontrado");
    }
}
