package br.negocio;

import java.sql.SQLException;

import br.persistencia.ClienteDAO;

public class ClienteFacade {

    public ClienteFacade(String nome, String cpf) throws SQLException {
        Cliente cliente = new Cliente(nome, cpf);
        ClienteDAO clienteDAO = new ClienteDAO();

        if (!clienteDAO.usuarioExists(cliente)) {
            clienteDAO.adicionar(cliente);
            System.out.println(clienteDAO.listar().toString());
        } else {
            System.out.println("Cliente já existe no banco de dados...");
        }
    }
    
}
