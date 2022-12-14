package utfpr.victor.projetopoo2.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author victo
 */
public class GerarBanco {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("javaCarDB");
        
        EntityManager manager = factory.createEntityManager();
    }
}
