package utfpr.victor.projetopoo2.dao.generic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import utfpr.victor.projetopoo2.modelo.conexao.ConexaoHibernate;


/**
 *
 * @author victo
 * @param <T>
 */
public class GenericDaoImpl<T> implements GenericDao<T>{
    EntityManager manager;
    
    public GenericDaoImpl(){
        manager = ConexaoHibernate.getInstance();
    }

    @Override
    public void save(T object) {
        manager.getTransaction().begin();
        manager.persist(object);
        manager.getTransaction().commit();    
    }

    @Override
    public T listOne(String Name, int Value, Class clazz) {
        String jpql = "SELECT t FROM " + clazz.getTypeName() + " t WHERE t." + Name + " = " + Value;
        
        Query query = this.manager.createQuery(jpql);
        Object obj = query.getSingleResult();
        
        return (T) obj;
    }

    @Override
    public List listaAll(Class clazz) {
        String jpql = "SELECT t FROM " + clazz.getTypeName();
        
        Query query  = this.manager.createQuery(jpql);
        Object obj = query.getResultList();
        
        return (List) (T) obj;
    }

    @Override
    public void Update(T object) {
        manager.getTransaction().begin();
        manager.merge(object);
        manager.getTransaction().commit();
    }

    @Override
    public void delete(T object) {
        manager.getTransaction().begin();
        manager.remove(object);
        manager.getTransaction().commit();
    }
    
    
}
