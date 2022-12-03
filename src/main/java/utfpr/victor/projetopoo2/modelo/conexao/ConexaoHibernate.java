package utfpr.victor.projetopoo2.modelo.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;

/**
 *
 * @author victo
 */
public class ConexaoHibernate {
    private static EntityManagerFactory factory;
    private static EntityManager manager;
    
    private static EntityManager getInstance(){
        if(manager == null){
            synchronized (ConexaoHibernate.class){
                if(manager == null){
                    try{
                        factory = Persistence.createEntityManagerFactory("Hibernate");
                        manager = factory.createEntityManager();
                    } 
                    catch(HibernateException he){
                        System.err.println(he.getMessage());
                    }
                }
            }
        }
        return manager;
    }
    public static void close(){
        manager.close();
        factory.close();
    }
}
