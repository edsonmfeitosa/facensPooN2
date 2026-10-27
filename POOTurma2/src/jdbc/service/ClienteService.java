
package jdbc.service;

import java.util.ArrayList;
import jdbc.dao.ClienteDao;
import jdbc.dao.IClienteDao;
import jdbc.model.Cliente;

public class ClienteService {
    private IClienteDao clienteDao;
    
    public ClienteService(ClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }
    public ArrayList<Cliente> consultar(){
        return clienteDao.consultar();
    }
    public Cliente consulta(int id){
        return clienteDao.consultar(id);
    }
    public Cliente cadastrar(Cliente cliente){
        return clienteDao.cadastrar(cliente);
    }
    public boolean excluir(int id){
        return clienteDao.excluir(id);
    }
    public boolean alterar(Cliente cliente, int id){
        return clienteDao.alterar(cliente, id);
    }
}
