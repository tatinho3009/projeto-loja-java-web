package br.com.intimidade.test;

import br.com.intimidade.model.produto.Camiseta;
import br.com.intimidade.model.produto.CamisetaTamanho;
import br.com.intimidade.model.produto.Categoria;

public class ProdutoTest {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();

        categoria.setNome("Camisetas");

        if (categoria.getNome().equals("Camisetas")) {
            Camiseta camiseta = new Camiseta();

            camiseta.setId(1);
            camiseta.setNome("Camiseta Polo HG Preta");
            camiseta.setTamanhos(CamisetaTamanho.GG);
            camiseta.salvarDados();
        }

    }
}
