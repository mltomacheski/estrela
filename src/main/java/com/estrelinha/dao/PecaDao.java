package com.estrelinha.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.estrelinha.conexao.Conexao;
import com.estrelinha.pojo.PecaPojo;

public class PecaDao {
    
    public void cadastrarPeca(PecaPojo pecaPojo) {

        //Cria a Conexão com o Banco de Dados
        //A Variavel Conexão recebe um novo Obrjeto do Tipo Conexão
        Conexao conexao = new Conexao();

        //Criado Variavel do tipo String(Texto), recebe um texto de insert
        //Os simbolos de interogação são os paramentros que vem de fora do sistema
        String sqlInsert = "insert into peca(nome, quantidade) value (?, ?)";

        //Cria a variavel do tipo PreparedStatement
        //Responsavel por preparar a Sql (Insert)
        PreparedStatement ps = null;    


        try {
            //Pegar conexao e preparar a SQL
            ps = conexao.getConexao().prepareStatement(sqlInsert);

            //setar (colocar) a informação no ps. pego a informação do pojo
            ps.setString(1, pecaPojo.getNome() );
            ps.setInt(2, pecaPojo.getQuantidade());

            ps.execute();
            ps.close();

            System.out.println("Peça Cadastrada Com Sucesso!!!");

        } catch (SQLException e) {
            // Lança um erro (imprimir)
            e.printStackTrace();
            System.out.println("Peça Não Cadastrada :(");
        }





    }

}
