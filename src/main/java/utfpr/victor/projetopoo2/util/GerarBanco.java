package utfpr.victor.projetopoo2.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import utfpr.victor.projetopoo2.modelo.vo.Adm;

/**
 *
 * @author victo
 */
public class GerarBanco {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("utfpr.victor_JavaCar_jar_1.0-SNAPSHOTPU");
        
        EntityManager manager = factory.createEntityManager();
        
        Adm adm1;
        adm1 = new Adm("adm","adm");
        
        manager.getTransaction().begin();
        manager.persist(adm1);
        manager.getTransaction().commit();
    }
}
