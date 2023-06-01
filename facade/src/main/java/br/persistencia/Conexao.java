package br.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    private String host;
    private String port;
    private String dbname;
    private String username;
    private String password;

    public Conexao() {
        this.host = "localhost";
        this.port = "5432";
        this.dbname = "facade_clientes";
        this.username = "postgres";
        this.password = "postgres";
             
    }

    public Connection getConexao(){
        String url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+this.dbname; 
        try {
            return DriverManager.getConnection(url, this.username, this.password);
        } catch (SQLException ex) {
            System.out.println("Erro na conexão.");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
