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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean alterar(Cliente cliente, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
