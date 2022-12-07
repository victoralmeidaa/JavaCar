package utfpr.victor.projetopoo2.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import utfpr.victor.projetopoo2.modelo.conexao.ConexaoHibernate;
import utfpr.victor.projetopoo2.modelo.vo.Cliente;

/**
 *
 * @author victo Almeida
 */
public class ClienteDaoImpl implements ClienteDao {
    EntityManager manager;
    
    public ClienteDaoImpl() {
        manager = ConexaoHibernate.getInstance();
    }

    @Override
    public void cadastrar(Cliente cliente) {
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Cliente cliente) {
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Cliente cliente) {
        manager.getTransaction().begin();
        manager.remove(cliente);
        manager.getTransaction().commit();
    }

    @Override
    public List<Cliente> listarTodos() {
        List<Cliente> clientes;
        
        Query query  = manager.createQuery("SELECT c FROM Cliente c");
        clientes = query.getResultList();
        
        return clientes;
    }

    @Override
    public Cliente listarUm(Long id) {
        Cliente cliente;
        
        Query query = manager.createQuery("SELECT c FROM Cliente c WHERE c.id = " + id);
        cliente = (Cliente)query.getSingleResult();
        
        return cliente;
    }
}
