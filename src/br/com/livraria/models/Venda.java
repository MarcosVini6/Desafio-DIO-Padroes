package br.com.livraria.models;

import br.com.livraria.interfaces.IVenda;

import java.util.ArrayList;
import java.util.List;

public class Venda implements IVenda {
    public Venda(List<Integer> ids, Cliente cliente, AcervoLivros acervoLivros) throws Exception {
        this.livros = new ArrayList<Livro>();
        for (int item : ids) {
            Livro livro = acervoLivros.buscarPorId(item);
            this.livros.add(livro);
        }

        this.cliente = cliente;
        for (Livro item : this.livros) {
            this.total += item.getPreco();
        }
    }

    List<Livro> livros;
    Cliente cliente;
    double total;

    @Override
    public double vender(double valor) throws Exception {
        if (valor >= this.total)
            return valor - this.total;
        throw new Exception("saldo insulficiente");
    }

    @Override
    public void imprimirNota(double troco,double valor) {
        System.out.println("Livros: " + livros.toString());
        System.out.println("Cliente: " + cliente.toString());
        System.out.println("valor pago: "+valor);
        System.out.println("total: " + total);
        System.out.println("troco: " + troco);

    }
}
