/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author WITCHS
 */
public class ModuloConexao {
    
    //Método por estabelecer a conexão com o banco de dados
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //abaixo chama o driver de importação do banco
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        // estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
         
}
