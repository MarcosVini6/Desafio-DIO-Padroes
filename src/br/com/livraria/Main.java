package br.com.livraria;

import br.com.livraria.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Autor autor1 = new Autor("J.K. Rollng");
            Autor autor2 = new Autor("G.G Martin");
            Genero genero1 = new Genero("fantasia");
            Genero genero2 = new Genero("guerra");
            Livro livro0 = new Livro("harry potter", 30.99, autor1, genero1);
            Livro livro1 = new Livro("GOT", 50.0, autor2, genero2);
            List<Livro> livros = new ArrayList<>();
            livros.add(livro0);
            livros.add(livro1);
            AcervoLivros acervoLivros = new AcervoLivros(livros);
            Cliente cliente = new Cliente("JOÃO", "40028922", "MV@BOL.COM", "11111111111");
            List<Integer> ids = new ArrayList<Integer>();
            ids.add(1);
            Venda venda = new Venda(ids, cliente, acervoLivros);
            double entrada = 100.0;
            double troco = venda.vender(entrada);
            venda.imprimirNota(troco, entrada);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
