package utfpr.victor.projetopoo2.modelo.dao;

import java.util.List;
import utfpr.victor.projetopoo2.modelo.vo.Funcionario;

/**
 *
 * @author victo
 */
public interface FuncionarioDao {
    void cadastrar (Funcionario funcionario);
    
    void atualizar (Funcionario funcionario);
    
    void excluir(Funcionario funcionario);
    
    List<Funcionario> listarTodos();
    
    Funcionario listarUm(Long id);
    
    List<Funcionario> ListarFiltroLike(String like);
}
