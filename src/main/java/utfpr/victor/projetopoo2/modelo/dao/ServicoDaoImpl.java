package utfpr.victor.projetopoo2.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import utfpr.victor.projetopoo2.modelo.vo.Servico;

/**
 *
 * @author victo
 */
public class ServicoDaoImpl implements ServicoDao{
    EntityManager manager;
    
    @Override
    public void cadastrar(Servico servico) {
        manager.getTransaction().begin();
        manager.persist(servico);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Servico servico) {
        manager.getTransaction().begin();
        manager.merge(servico);
        manager.getTransaction().commit();
                
    }

    @Override
    public void excluir(Servico servico) {
        manager.getTransaction().begin();
        manager.remove(servico);
        manager.getTransaction().commit();
    }

    @Override
    public List<Servico> listarTodos() {
        List<Servico> servico;
        
        Query query = manager.createQuery("SELECT c FROM Servico c");
        servico = query.getResultList();
        
        return servico;     
    }

    @Override
    public Servico listarUm(Long id) {
        Servico servico;
        
        Query query = manager.createQuery("SELECT c FROM Servico c WHERE c.id = " + id);
        servico = (Servico)query.getSingleResult();
        
        return servico;
    }
    
}
