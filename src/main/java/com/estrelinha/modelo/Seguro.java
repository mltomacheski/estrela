package com.estrelinha.modelo;

public class Seguro {
   
    private String nome;

    @Deprecated
    public Seguro() {
    }

    public Seguro(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == "Lula") {
            System.out.println("não usar meu nome");
        } else {
            System.out.println("nome válido, gravado");
            this.nome = nome;
        }
    }

    


    
}
