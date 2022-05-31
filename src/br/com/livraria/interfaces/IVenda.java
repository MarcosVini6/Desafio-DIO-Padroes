package br.com.livraria.interfaces;

public interface IVenda {
        double vender(double valor) throws Exception;
        void imprimirNota(double troco,double valor);
}
