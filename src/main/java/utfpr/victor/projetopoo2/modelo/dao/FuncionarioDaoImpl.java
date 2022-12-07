package utfpr.victor.projetopoo2.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import utfpr.victor.projetopoo2.modelo.conexao.ConexaoHibernate;
import utfpr.victor.projetopoo2.modelo.vo.Funcionario;

/**
 *
 * @author victo
 */
public class FuncionarioDaoImpl implements FuncionarioDao{
    EntityManager manager;
    
    public FuncionarioDaoImpl(){
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void cadastrar(Funcionario funcionario) {
        
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        
    }

    @Override
    public void excluir(Funcionario funcionario) {
        
    }

    @Override
    public List<Funcionario> listarTodos() {
        
    }

    @Override
    public Funcionario listUm(Long Id) {
       
    }
    
}
