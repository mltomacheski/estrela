package com.estrelinha.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    //Atributos do protocolo de conexão com o banco de dados 
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String password = "";

    //Método para criar a conexão com o BD
    public void getConexao() {
        Connection conexao = DriverManager.getConnection(url, user, password);
    }

}

