package com.estrelinha.pojo;

public class VeiculoPojo {
    
    public String placa;
    public String modelo;
    public String ano; 
    public String cor; 
    public String chassi;

    @Deprecated
    public VeiculoPojo() {
    }


    public VeiculoPojo(String placa, String modelo, String ano, String cor, String chassi) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.chassi = chassi;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getAno() {
        return ano;
    }


    public void setAno(String ano) {
        this.ano = ano;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getChassi() {
        return chassi;
    }


    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
