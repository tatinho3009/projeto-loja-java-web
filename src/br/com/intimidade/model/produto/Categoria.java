package br.com.intimidade.model.produto;

import br.com.intimidade.model.Model;

public class Categoria extends Model {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
