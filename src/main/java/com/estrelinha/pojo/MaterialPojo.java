package com.estrelinha.pojo;

public class MaterialPojo {

    private String nome;
    private int quantidade;

    @Deprecated
    public MaterialPojo() {
    }
    
    public MaterialPojo(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

        
}
