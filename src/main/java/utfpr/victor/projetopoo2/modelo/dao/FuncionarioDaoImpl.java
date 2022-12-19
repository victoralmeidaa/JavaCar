package utfpr.victor.projetopoo2.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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
        manager.getTransaction().begin();
        manager.persist(funcionario);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        manager.getTransaction().begin();
        manager.merge(funcionario);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Funcionario funcionario) {
        manager.getTransaction().begin();
        manager.remove(funcionario);
        manager.getTransaction().commit();
    }

    @Override
    public List<Funcionario> listarTodos() {
        List<Funcionario> funcionarios;
        
        Query query = manager.createQuery("SELECT c FROM Funcionario c");
        funcionarios = query.getResultList();
        
        return funcionarios;
    }

    @Override
    public Funcionario listarUm(Long id) {
        Funcionario funcionario;
        
        Query query = manager.createQuery("SELECT c FROM Funcionario c WHERE c.id = " + id);
        funcionario = (Funcionario)query.getSingleResult();
        
        return funcionario; 
    } 
        
    @Override
    public List<Funcionario> ListarFiltroLike(String like) {
        List<Funcionario> funcionarios;
        
        Query query = manager.createQuery("SELECT c FROM Funcionario c WHERE c.nome LIKE '%" + like + "%'");
        funcionarios = query.getResultList();
        return funcionarios;
    }  
}