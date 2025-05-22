package com.estrelinha;

import java.sql.Connection;

import com.estrelinha.conexao.Conexao;
import com.estrelinha.dao.MaterialDao;
import com.estrelinha.dao.PecaDao;
import com.estrelinha.modelo.Material;
import com.estrelinha.modelo.Peca;
import com.estrelinha.pojo.PecaPojo;
import com.estrelinha.pojo.MaterialPojo;
import com.estrelinha.dao.VeiculoDao;
import com.estrelinha.modelo.Veiculo;
import com.estrelinha.pojo.VeiculoPojo;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Conexao conexao = new Conexao();

        //conexao.getConexao();

        Peca peca = new Peca("Vela", 19);
        Material material = new Material("Porta", 16);

        PecaPojo pecaPojo = new PecaPojo(peca.getNome(), peca.getQuantidade());
        MaterialPojo materialPojo = new MaterialPojo(material.getNome(), material.getQuantidade());

        PecaDao pecaDao = new PecaDao();
        MaterialDao materialDao = new MaterialDao();

        pecaDao.cadastrarPeca(pecaPojo);
        materialDao.cadastrarMaterial(materialPojo);
        // Conexao conexao = new Conexao();
        //conexao.getConexao();

        Veiculo veiculo = new Veiculo("1546fgd", "","2019","", "ssugifygiYG");

        VeiculoPojo veiculoPojo = new VeiculoPojo(
            veiculo.getPlaca(), 
            veiculo.getModelo(),
            veiculo.getAno(), 
            veiculo.getCor(),
            veiculo.getChassi()
            );

        VeiculoDao veiculoDao = new VeiculoDao();

    }

//     package com.ejcar;

// import com.ejcar.modelo.Veiculo;

// /**
//  * Hello world!
//  *
//  */
// public class App 
// {
//     public static void main( String[] args )
//     {
//         Veiculo veiculo = new Veiculo("mk2401sl");
//         veiculo.setModelo("SUV");
//         veiculo.setAno("2008");
//         veiculo.setCor("Preto brilhoso");
//         veiculo.setChassi("1254kljhmy457896l");


//         Veiculo veiculo2 = new Veiculo("0000000");
//         veiculo2.setModelo("Perca total");
//         veiculo2.setAno("0000");
//         veiculo2.setCor("Invisivel");
//         veiculo2.setChassi("123456789");



//         veiculo.imprimir();
//         veiculo2.imprimir();


//         if(veiculo.equals(veiculo2)){
//             System.out.println("O veiculo tem o mesmo nome");
//         } else{
//             System.out.println("O veiculo não tem o mesmo nome");
//         }

        
//     }
// }

}
