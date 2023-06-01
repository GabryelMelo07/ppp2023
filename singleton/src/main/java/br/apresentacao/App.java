package br.apresentacao;

import java.sql.Connection;
import java.sql.SQLException;

import br.negocio.ClienteFacade;
import br.persistencia.Conexao;

public class App {
    public static void main( String[] args ) throws SQLException {

        ClienteFacade gabryel = new ClienteFacade("Gabryel", "03064462008");
        ClienteFacade igor = new ClienteFacade("Igor avila", "12345678910");
        
        Connection con1 = Conexao.getConexao(); // Conexão instanciada a primeira vez.
        Connection con2 = Conexao.getConexao(); // Conexão não será alterada, pois já foi instanciada (mesmo endereçamento de memória).

        System.out.println(con1); // Mesmo endereçamento de memória. 
        System.out.println(con2); // Mesmo endereçamento de memória.

        con1.close(); // Fecha a conexão.
    }
}
