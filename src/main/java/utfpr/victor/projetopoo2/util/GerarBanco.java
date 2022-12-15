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
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("javacar01");
        
        EntityManager manager = factory.createEntityManager();
        
        Adm adm1 = new Adm();
        
        adm1.setName("adm");
        adm1.setSenha("adm");
        
        manager.getTransaction().begin();
        manager.persist(adm1);
        manager.getTransaction().commit();
    }
}
