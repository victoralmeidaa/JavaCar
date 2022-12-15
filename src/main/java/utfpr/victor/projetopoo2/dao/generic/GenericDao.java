package utfpr.victor.projetopoo2.dao.generic;

import java.util.List;


/**
 *
 * @author victo
 * @param <T>
 */
public interface GenericDao<T> {
    
    void save(T onject);
    
    T listOne(String Name,int Value, Class calzz);
    
    List listaAll(Class clazz);
    
    void Update(T object);
    
    void delete(T object);
}
