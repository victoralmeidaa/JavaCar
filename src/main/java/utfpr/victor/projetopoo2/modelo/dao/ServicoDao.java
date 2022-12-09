package utfpr.victor.projetopoo2.modelo.dao;

import java.util.List;
import utfpr.victor.projetopoo2.modelo.vo.Servico;

/**
 *
 * @author victo
 */
public interface ServicoDao{
    void cadastrar(Servico servico);
    
    void atualizar(Servico servico);
    
    void excluir(Servico servico);
    
    List<Servico> listarTodos();   
    
    Servico listarUm(Long id);
}
