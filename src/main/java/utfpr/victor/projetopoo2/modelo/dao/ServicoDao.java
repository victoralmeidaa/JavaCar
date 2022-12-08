package utfpr.victor.projetopoo2.modelo.dao;

import java.util.List;
import utfpr.victor.projetopoo2.modelo.vo.Servico;

/**
 *
 * @author victo
 */
public interface ServicoDao{
    void cadastrar(Servico cliente);
    
    void atualizar(Servico cliente);
    
    void excluir(Servico cliente);
    
    List<Servico> listarTodos();   
    
    Servico listarUm(Long id);
}
