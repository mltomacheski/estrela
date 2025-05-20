package com.estrelinha.modelo;

public class Vistoria{
    private String entrada;
    private String saida;

    public Vistoria(String entrada, String saida) {
        this.entrada = entrada;
        this.saida = saida;
    }

    public String getEntrada(){
        return this.entrada;         
    }
    
    public String getSaida(){
        return this.saida;        
    }

    public void setEntrada (String entrada){
        if(entrada.equals("07")) {
            this.entrada = entrada;
        }else {
            System.out.println ("Não entra na oficina, apenas a partir das 08:00 horas da manhã!");
        }
    }

    public void setSaida (String saida){
        if(entrada.equals("18")) {
            this.saida = saida;
        }else {
            System.out.println ("Não sai da oficina, apenas das 08:00 ás 18:00");
        }
    }



}