package br.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    private static Connection INSTANCE;
    
    private static String host;
    private static String port;
    private static String dbname;
    private static String username;
    private static String password;

    public static synchronized Connection getConexao(){
        Conexao.host = "localhost";
        Conexao.port = "5432";
        Conexao.dbname = "facade_clientes";
        Conexao.username = "postgres";
        Conexao.password = "postgres";
        
        String url = "jdbc:postgresql://"+Conexao.host+":"+Conexao.port+"/"+Conexao.dbname; 
        try {
            if(INSTANCE == null) {
                INSTANCE = DriverManager.getConnection(url, Conexao.username, Conexao.password);
            }  
        } catch (SQLException ex) {
            System.out.println("Erro na conexão.");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return INSTANCE;
    }

    public void close() throws SQLException {
        if (INSTANCE != null) {
            INSTANCE.close();
        }
    }
    
}
