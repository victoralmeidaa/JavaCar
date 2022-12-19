package utfpr.victor.projetopoo2.modelo.dao;

import utfpr.victor.projetopoo2.modelo.vo.Cliente;
import java.util.List;

/**
 *
 * @author Victor Almeida
 */
public interface ClienteDao {
    void cadastrar(Cliente cliente);
    
    void atualizar(Cliente cliente);
    
    void excluir(Cliente cliente);
    
    List<Cliente> listarTodos();   
    
    Cliente listarUm(Long id);
    
    List<Cliente> ListarFiltroLike(String like);
}
