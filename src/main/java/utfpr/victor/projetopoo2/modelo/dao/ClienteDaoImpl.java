package utfpr.victor.projetopoo2.modelo.dao;

import javax.persistence.EntityManager;

/**
 *
 * @author victo
 */
public interface ClienteDaoImpl implements ClienteDao {
    EntityManager manager;
    
    public ClienteDaoImpl() {
        manager = ConexaoHibernate.getInstance();
    }


}
