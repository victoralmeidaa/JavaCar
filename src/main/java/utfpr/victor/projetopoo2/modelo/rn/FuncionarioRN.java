package utfpr.victor.projetopoo2.modelo.rn;

import java.util.List;
import org.hibernate.HibernateException;
import utfpr.victor.projetopoo2.modelo.dao.FuncionarioDao;
import utfpr.victor.projetopoo2.modelo.dao.FuncionarioDaoImpl;
import utfpr.victor.projetopoo2.modelo.vo.Funcionario;

/**
 *
 * @author victo
 */
public class FuncionarioRN {
    private FuncionarioDao funcionarioDao;
    
    public FuncionarioRN(){
        funcionarioDao = new FuncionarioDaoImpl();
    }
    
    public void cadastrar(Funcionario funcionario){
        try {
            funcionarioDao.cadastrar(funcionario);
        }catch(HibernateException he){
            System.out.println(he);
        }
    }
    
    public void atualizar(Funcionario funcionario){
        funcionarioDao.atualizar(funcionario);
    }
    
    public void excluir(Funcionario funcionario){
        funcionarioDao.excluir(funcionario);
    }
    
    public List<Funcionario> listarTodos(){
        return funcionarioDao.listarTodos();
    }
    
    public Funcionario listarUm(Long id){
        return funcionarioDao.listarUm(id);
    }
    
}
