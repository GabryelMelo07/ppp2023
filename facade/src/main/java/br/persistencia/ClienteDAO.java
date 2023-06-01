package br.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.negocio.Cliente;

public class ClienteDAO {

    public ClienteDAO() {
    }
    
    public void adicionar(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nome, cpf) VALUES (?,?);";
        Connection connection = new Conexao().getConexao();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, cliente.getNome());
        preparedStatement.setString(2, cliente.getCpf());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

    public Cliente obter(String cpf) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE cpf = ?";
        Connection connection = new Conexao().getConexao();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, cpf);
        ResultSet rs = preparedStatement.executeQuery();
        Cliente cliente = new Cliente();
        if (rs.next()) {
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            return cliente;
        }
        preparedStatement.close();
        connection.close();
        return null;
    }

    public ArrayList<Cliente> listar() throws SQLException {
        String sql = "SELECT * FROM cliente";
        Connection connection = new Conexao().getConexao();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        ArrayList<Cliente> vetCliente = new ArrayList<Cliente>();
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            vetCliente.add(cliente);
        }
        preparedStatement.close();
        connection.close();
        return vetCliente;
    }

    public boolean usuarioExists(Cliente cliente) throws SQLException {
        if(obter(cliente.getCpf()) == null) {
            return false;
        } else {
            return true;
        }
    }
    
}
