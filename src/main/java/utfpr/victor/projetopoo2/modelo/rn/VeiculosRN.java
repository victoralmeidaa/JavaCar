package utfpr.victor.projetopoo2.modelo.rn;

import java.util.List;
import org.hibernate.HibernateException;
import utfpr.victor.projetopoo2.modelo.dao.VeiculosDao;
import utfpr.victor.projetopoo2.modelo.dao.VeiculosDaoImpl;
import utfpr.victor.projetopoo2.modelo.vo.Veiculos;

/**
 *
 * @author victo
 */

public class VeiculosRN {
    private VeiculosDao veiculosDao;
    
    public VeiculosRN(){
        veiculosDao = new VeiculosDaoImpl();
    }
     
    public void cadastrar(Veiculos veiculos){
        try {
            veiculosDao.cadastrar(veiculos);
        } catch(HibernateException he){
            System.err.println(he);
        }
    }
    
    public void atualizar(Veiculos veiculos){
        veiculosDao.atualizar(veiculos);
    }
    
    public void excluir(Veiculos veiculos){
        veiculosDao.excluir(veiculos);
    }
    
    public List<Veiculos> listarTodos(){
        return veiculosDao.listarTodos();
    }
    
    public Veiculos listarUm(Long id){
        return veiculosDao.listarUm(id);
    }
        
}
