/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quinkas.dao;

import br.com.quinkas.util.CriarBanco;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author erick
 */
public class ConnectionFactory {
    private static String USER = "root";
    private static String SENHA = "";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/quinkasbd?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false", USER, SENHA);
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void close(Connection conn) throws Exception {
        close(conn, null, null);
    }

    public static void close(Connection conn, Statement stmt) throws Exception {
        close(conn, stmt, null);
    }
    
    public static void criarBancoDeDados() throws Exception{
        for (String sql : CriarBanco.sqlBanco()) {
            executarSql(sql);
        }
    }
    
    private static void executarSql(String sql) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");  
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false", USER, SENHA);
        try {          
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.close();
        }
    }
}
