package utfpr.victor.projetopoo2.modelo.rn;

import java.util.List;
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
    
    public void atualizar(Cliente cliente){
        clienteDao.atualizar(cliente);
    }
    
    public void excluir(Cliente cliente){
        clienteDao.excluir(cliente);
    }
    
    public List<Cliente> listarTodos(){
        return clienteDao.listarTodos();
    }
    
    public Cliente listarUm(Long id){
        return clienteDao.listarUm(id);
    }
    
    public List<Cliente> listarFitroLike(String like) {
        return clienteDao.ListarFiltroLike(like);
    }
}
