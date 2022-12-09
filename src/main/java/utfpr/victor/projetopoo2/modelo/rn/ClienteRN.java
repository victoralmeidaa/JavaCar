package utfpr.victor.projetopoo2.modelo.rn;

import org.hibernate.HibernateException;
import utfpr.victor.projetopoo2.modelo.dao.ClienteDao;
import utfpr.victor.projetopoo2.modelo.dao.ClienteDaoImpl;
import utfpr.victor.projetopoo2.modelo.vo.Cliente;

/**
 *
 * @author victo
 */
public class ClienteRN {
    
    private ClienteDao clienteDao;
    
    public ClienteRN(){
        clienteDao = new ClienteDaoImpl();
    }
    
    public void cadastrar(Cliente cliente){
        try{
            clienteDao.cadastrar(cliente);
        } catch(HibernateException he){
            System.err.println(he);
        }
    }
}
