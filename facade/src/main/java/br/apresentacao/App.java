package br.apresentacao;

import java.sql.SQLException;

import br.negocio.ClienteFacade;

public class App {
    public static void main( String[] args ) throws SQLException {

        ClienteFacade gabryel = new ClienteFacade("Gabryel", "03064462008");
        ClienteFacade igor = new ClienteFacade("Igor avila", "12345678910");
        
    }
}
