package utfpr.victor.projetopoo2.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import utfpr.victor.projetopoo2.modelo.conexao.ConexaoHibernate;
import utfpr.victor.projetopoo2.modelo.vo.Adm;

/**
 *
 * @author victo
 */
public class AdmDaoImpl implements AdmDao{
    EntityManager manager;
    
    public AdmDaoImpl(){
        manager = ConexaoHibernate.getInstance();
    }

    @Override
    public Adm listarUm(Long id) {
        Adm adm;
        
        Query query = manager.createQuery("SELECT c FROM Funcionario c WHERE c.id = " + id);
        adm = (Adm)query.getSingleResult();
        
        return adm; 
    }
    
}
