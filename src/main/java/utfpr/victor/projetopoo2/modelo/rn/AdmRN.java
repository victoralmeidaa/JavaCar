package utfpr.victor.projetopoo2.modelo.rn;

import utfpr.victor.projetopoo2.modelo.dao.AdmDao;
import utfpr.victor.projetopoo2.modelo.dao.AdmDaoImpl;
import utfpr.victor.projetopoo2.modelo.vo.Adm;

/**
 *
 * @author victo
 */
public class AdmRN {
    
    private AdmDao admDao;
    
    public AdmRN(){
        admDao = new AdmDaoImpl();
    }
    
    
    public Adm listarUm(Long id){
        return admDao.listarUm(id);
    }
    
}
