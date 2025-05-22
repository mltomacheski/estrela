package com.estrelinha.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.estrelinha.conexao.Conexao;
import com.estrelinha.pojo.VeiculoPojo;

public class VeiculoDao {

    public void cadastrarVeiculo(VeiculoPojo veiculoPojo) {
        //Cria a conexão com o banco de dados 
        //A variável conexao recebe um novo objeto do tipo Conexao
        Conexao conexao = new Conexao();

        //Criado variável do tipo String "texto", recebe um texto de insert
        //Os simbolos de interrogação são os parametros que vem de fora do sistema 
        String sqlInsert = "insert into veiculo(placa, ano, chassi ) value (?, ?, ?);";

        //Cria a variável do tipo PreparedStatement
        //Responsavel por preparar a sql (insert)
        PreparedStatement ps = null;

        try {

            //Pegar uma conexão e preparar a sql
            ps = conexao.getConexao().prepareStatement(sqlInsert);

            ps.setString(1, veiculoPojo.getPlaca());


        } catch (SQLException e) {
            // Lança um erro (imprimir)
            e.printStackTrace();
        }

    }

}
