package jdbc.dao;

import java.util.ArrayList;
import jdbc.model.Cliente;
import java.sql.*;
import jdbc.factory.ConnectionFactory;

public class ClienteDao implements IClienteDao{
    private Connection conexao;
    
    public ClienteDao(){
        ConnectionFactory c = new ConnectionFactory();
        this.conexao = c.getConnection();
    }
    
    @Override
    public ArrayList<Cliente> consultar() {
        ArrayList<Cliente> lst = new ArrayList<>();
        String query = "select * from cliente";
        try {
            PreparedStatement comando = conexao.prepareStatement(query);
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {                
                Cliente c = new Cliente();
                c.setCod_cliente(resultado.getInt("cod_cliente"));
                c.setNome(resultado.getString("nome"));
                c.setTelefone(resultado.getString("telefone"));
                c.setRg(resultado.getString("rg"));
                c.setCpf(resultado.getString("cpf"));
                c.setEmail(resultado.getString("email"));
                c.setSexo(resultado.getString("sexo"));
                c.setEndereco(resultado.getString("endereco"));
                c.setBairro(resultado.getString("bairro"));
                c.setCidade(resultado.getString("cidade"));
                c.setEstado(resultado.getString("estado"));
                lst.add(c);
            }
            return lst;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }
    }

    @Override
    public Cliente consultar(int id) {
        String query = "select * from cliente where cod_cliente = ?";
        try {
            PreparedStatement comando = conexao.prepareStatement(query);
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();
            Cliente c = new Cliente();
            if (resultado.next()) {
                c.setCod_cliente(resultado.getInt("cod_cliente"));
                c.setNome(resultado.getString("nome"));
                c.setTelefone(resultado.getString("telefone"));
                c.setRg(resultado.getString("rg"));
                c.setCpf(resultado.getString("cpf"));
                c.setEmail(resultado.getString("email"));
                c.setSexo(resultado.getString("sexo"));
                c.setEndereco(resultado.getString("endereco"));
                c.setBairro(resultado.getString("bairro"));
                c.setCidade(resultado.getString("cidade"));
                c.setEstado(resultado.getString("estado"));
            }
            return c;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }
    }

    @Override
    public Cliente cadastrar(Cliente cliente) {
        String query = "insert into cliente (nome, telefone, rg, cpf, email, sexo, \n" +
    " endereco, bairro, cidade, estado)\n" +
    " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement comando = conexao.prepareStatement(query,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getTelefone());
            comando.setString(3, cliente.getRg());
            comando.setString(4, cliente.getCpf());
            comando.setString(5, cliente.getEmail());
            comando.setString(6, cliente.getSexo());
            comando.setString(7, cliente.getEndereco());
            comando.setString(8, cliente.getBairro());
            comando.setString(9, cliente.getCidade());
            comando.setString(10, cliente.getEstado());
            comando.executeUpdate();
            ResultSet resultado = comando.getGeneratedKeys();
            if (resultado.next()) {
                cliente.setCod_cliente(resultado.getInt(1));
            }
            return cliente;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }
    }

    @Override
    public boolean alterar(Cliente cliente, int id) {
        String query = "update cliente set nome = ?, telefone = ?, rg = ?,\n" +
        "cpf = ?, email = ?, sexo = ?, endereco = ?, \n" +
        "bairro = ?, cidade = ?, estado = ?\n" +
        "where cod_cliente = ?";
        try {
            PreparedStatement comando = conexao.prepareStatement(query);
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getTelefone());
            comando.setString(3, cliente.getRg());
            comando.setString(4, cliente.getCpf());
            comando.setString(5, cliente.getEmail());
            comando.setString(6, cliente.getSexo());
            comando.setString(7, cliente.getEndereco());
            comando.setString(8, cliente.getBairro());
            comando.setString(9, cliente.getCidade());
            comando.setString(10, cliente.getEstado());
            comando.setInt(11, id);
            if (comando.executeUpdate() > 0) {
                return true;
            }
            else{
                return false;
            }
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }
    }

    @Override
    public boolean excluir(int id) {
        String query = "delete from cliente where cod_cliente = ?";
        try{
            PreparedStatement comando = conexao.prepareStatement(query);
            comando.setInt(1, id);
            if (comando.executeUpdate() > 0) {
                return true;
            }
            else {
                return false;
            }
        }
        catch(SQLException erro){
            throw new RuntimeException(erro.getMessage());
        }
    }
    
}
