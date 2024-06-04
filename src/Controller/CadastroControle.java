/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.Cadastro;
import static ModeloDAO.ModeloDAO.listarTodos;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Junior
 */
public class CadastroControle {
    public static List<Object[]> obterTodos() throws SQLException, ClassNotFoundException {
        List<Object[]> retorno = new java.util.ArrayList<>();
        List<Cadastro> cadastro = listarTodos();
        for (Cadastro cad : cadastro) {
            retorno.add(new Object[]{cad.getId(), cad.getCNPJ(), cad.getNome(), cad.getPix(), cad.getTipoPix(), cad.getUF(), cad.getFuncao(), cad.getBanco()});
        }
        return retorno;
    }
}
