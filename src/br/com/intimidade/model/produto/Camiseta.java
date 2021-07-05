package br.com.intimidade.model.produto;

public class Camiseta extends Produto {
    private CamisetaTamanho camisetaTamanho;

    public CamisetaTamanho getTamanhos() {
        return camisetaTamanho;
    }

    public void setTamanhos(CamisetaTamanho camisetaTamanho) {
        this.camisetaTamanho = camisetaTamanho;
    }

    public void salvarDados() {
        System.out.println("Id: " +this.getId());
        System.out.println("Nome: " +this.getNome());
        System.out.println("Tamanho: " +this.getTamanhos());
        System.out.println("Preço de Custo: " +this.getPrecoDeCusto());
        System.out.println("Preço de Venda: " +this.getPrecoDeVenda());
    }
}
