package utfpr.victor.projetopoo2.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import utfpr.victor.projetopoo2.modelo.vo.Veiculos;

/**
 *
 * @author victo
 */
public class VeiculosImpl implements VeiculosDao{
    EntityManager manager;

    @Override
    public void cadastrar(Veiculos veiculos) {
        manager.getTransaction().begin();
        manager.persist(veiculos);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Veiculos veiculos) {
        manager.getTransaction().begin();
        manager.merge(veiculos);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Veiculos veiculos) {
        manager.getTransaction().begin();
        manager.remove(veiculos);
        manager.getTransaction().commit();
    }

    @Override
    public List<Veiculos> listarTodos() {
        List<Veiculos> veiculos;
        
        Query query = manager.createQuery("SELECT c FROM Veiculos c");
        veiculos = query.getResultList();
        
        return veiculos;
    }

    @Override
    public Veiculos listarUm(Long id) {
        Veiculos veiculos;
        
        Query query = manager.createQuery("SELECT c FROM Veiculos c WHERE c.id" + id);
        veiculos = (Veiculos)query.getSingleResult();
        
        return veiculos;
    }
    
}
