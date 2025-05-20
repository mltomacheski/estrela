package com.estrelinha.modelo;

public class Agendamento {
    private String dataEntrada;
    private String dataSaida;
    private String horarioEntrada;
    private String horarioSaida;
   
    @Deprecated
    public Agendamento() {
    }

    public Agendamento(String dataEntrada, String dataSaida, String horarioEntrada, String horarioSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    @Override
    public String toString() {
        return "Agendamento [dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", horarioEntrada="
                + horarioEntrada + ", horarioSaida=" + horarioSaida + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Agendamento other = (Agendamento) obj;
        if (dataEntrada == null) {
            if (other.dataEntrada != null)
                return false;
        } else if (!dataEntrada.equals(other.dataEntrada))
            return false;
        if (dataSaida == null) {
            if (other.dataSaida != null)
                return false;
        } else if (!dataSaida.equals(other.dataSaida))
            return false;
        if (horarioEntrada == null) {
            if (other.horarioEntrada != null)
                return false;
        } else if (!horarioEntrada.equals(other.horarioEntrada))
            return false;
        if (horarioSaida == null) {
            if (other.horarioSaida != null)
                return false;
        } else if (!horarioSaida.equals(other.horarioSaida))
            return false;
        return true;
    }
    
    
}
