
package jdbc.main;
import java.sql.*;
import java.util.ArrayList;
import jdbc.dao.ClienteDao;
import jdbc.factory.ConnectionFactory;
import jdbc.model.Cliente;

public class AulaBD {
    public static void main(String[] args) {
        //Connection c = new ConnectionFactory().getConnectionPortable();
        //System.out.println("Deu certo");
        ClienteDao cDao = new ClienteDao();
        /*
        ArrayList<Cliente> clientes = cDao.consultar();
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
        */
        System.out.println(cDao.consultar(2).toString());
    }
}
