/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Modelo.Cadastro;
import Util.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author André
 */
public class ModeloDAO {

    public void cadastrar(Cadastro cad) throws SQLException, ClassNotFoundException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into cadastro.Funcionario (Nome,Enderco,salario,Pix,CNPJ,CPF,Telefone,Estadocivil,Genero,Banco, ChavePix)   ) values (?,?,?,?,?,?,?,?,?,?,?) ");
  
        comando.setString(2, cad.getNome());
        comando.setString(3, cad.getEndereco());
        comando.setDouble(4, cad.getsalario());
        comando.setString(5, cad.getPix());
        comando.setString(6, cad.getCNPJ());
        comando.setString(7, cad.getCPF());
        comando.setString(8, cad.getTelefone());
        comando.setString(9, cad.getEstadocivil());
        comando.setString(11, cad.getBanco());
        comando.setString(12, cad.getFuncao());
        

        comando.execute();

    }

    public void deletar(Cadastro cad) throws SQLException, ClassNotFoundException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("delete from Cadastro where id = (?)");
        comando.setInt(1, cad.getId());
        comando.execute();

    }

    public void atualizar(Cadastro cad) throws SQLException, ClassNotFoundException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("update Cadastro.Funcionario set Nome = ?, Pix = ?, Banco= ? , CNPJ = ?,Endereco = ?,CPF= ?,Telefone= ?,Estadocivil^= ?,Genero= ?, ChavePix= ? where id = ?");
        comando.setString(1, cad.getNome());
        comando.setString(2, cad.getPix());
        comando.setString(3, cad.getBanco());
        comando.setString(5, cad.getEndereco());
        comando.setString(6, cad.getCPF());
        comando.setString(7, cad.getTelefone());
        comando.setString(8, cad.getEstadocivil());
        comando.setString(9, cad.getGenero());
        comando.setString(10, cad.getChavePix());
        comando.setString(11, cad.getFuncao());
        comando.executeUpdate();

    }

    public Cadastro consultarById(Cadastro c) throws SQLException, ClassNotFoundException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from produto where id=?");
        comando.setInt(1, c.getId());
        ResultSet rs = comando.executeQuery();
        Cadastro cad = new Cadastro();
        while (rs.next()) {
            cad.setId(rs.getInt("Id"));
            cad.setNome(rs.getString("Nome"));
            cad.setPix(rs.getString("Pix"));
            cad.setBanco(rs.getString("Banco"));
            cad.setEndereco(rs.getString("Endereco"));
            cad.setCPF(rs.getString("CPF"));
            cad.setTelefone(rs.getString("Telefone"));
            cad.setEstadocivil(rs.getString("Estadocivil"));
            cad.setChavePix(rs.getString("ChavePix"));
            cad.setChavePix(rs.getString("Funcao"));
        }
        con.close();
        return cad;
    }

    public static List<Cadastro> listarTodos() throws SQLException, ClassNotFoundException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from tarefa");
        ResultSet rs = comando.executeQuery();
        List<Cadastro> retorno = new ArrayList<>();

        try {
            con = FabricaConexao.getConexao();
            comando = con.prepareStatement("select * from sistema.tarefa");
            rs = comando.executeQuery();
            while (rs.next()) {
                Cadastro cad = new Cadastro();
                cad.setId(rs.getInt("Id"));
                cad.setNome(rs.getString("Nome"));
                cad.setPix(rs.getString("Pix"));
                cad.setBanco(rs.getString("Banco"));
                cad.setEndereco(rs.getString("Endereco"));
                cad.setCPF(rs.getString("CPF"));
                cad.setTelefone(rs.getString("Telefone"));
                cad.setEstadocivil(rs.getString("Estadocivil"));
                cad.setChavePix(rs.getString("ChavePix"));
                cad.setChavePix(rs.getString("Funcao"));
            }
            con.close();

        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        return retorno;
    }
}
