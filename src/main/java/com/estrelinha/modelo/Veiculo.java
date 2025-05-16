package com.estrelinha.modelo;

public class Veiculo {
    public String placa;
    public String modelo;
    public String ano; 
    public String cor; 
    public String chassi;

    @Deprecated
    public Veiculo() {
    }

    public Veiculo(String placa, String modelo, String ano, String cor, String chassi) {
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

    @Override
    public String toString() {
        return "Veiculo placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + ", chassi=" + chassi
                + "]";
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Veiculo other = (Veiculo) obj;
        if (placa == null) {
            if (other.placa != null)
                return false;
        } else if (!placa.equals(other.placa))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (ano == null) {
            if (other.ano != null)
                return false;
        } else if (!ano.equals(other.ano))
            return false;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        if (chassi == null) {
            if (other.chassi != null)
                return false;
        } else if (!chassi.equals(other.chassi))
            return false;
        return true;
    }

    
}

