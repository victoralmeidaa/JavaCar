package utfpr.victor.projetopoo2.modelo.rn;

import java.util.List;
import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import utfpr.victor.projetopoo2.modelo.dao.ServicoDao;
import utfpr.victor.projetopoo2.modelo.dao.ServicoDaoImpl;
import utfpr.victor.projetopoo2.modelo.vo.Servico;

/**
 *
 * @author victo
 */

public class ServicoRN {

    private ServicoDao servicoDao;
    
    public ServicoRN(){
        servicoDao = new ServicoDaoImpl();
    }
    
    public void cadastrar(Servico servico){
        try{
            servicoDao.cadastrar(servico);
        } catch(HibernateException he){
            System.err.println(he);
        }
    }
    
    public void atualizar(Servico servico){
        servicoDao.atualizar(servico);
    }
    
    public void excluir(Servico servico){
        servicoDao.excluir(servico);
    }
    
    public List<Servico> listarTodos(){
        return servicoDao.listarTodos();
    }
    
    public Servico listarUm(Long id){
        return servicoDao.listarUm(id);
    }
}
