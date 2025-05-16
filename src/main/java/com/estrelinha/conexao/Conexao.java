package com.estrelinha.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    //Atributos do protocolo de conexão com o banco de dados 
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String password = "";

    private Connection conexao;

    //Método para criar a conexão com o BD
    public Connection getConexao() {
        // Tente 
        try {
            //Fazer isso 

            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem sucedida!");
                return conexao;
        } catch (SQLException e) { // Deu ruim, se não conseguiu 

            e.printStackTrace();
            System.out.println("Erro na conexão!");

        }
        return null; 
    }

}

