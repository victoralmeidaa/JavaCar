package utfpr.victor.projetopoo2.modelo.dao;

import java.util.List;
import utfpr.victor.projetopoo2.modelo.vo.Veiculos;

/**
 *
 * @author victo
 */
public interface VeiculosDao {
    void cadastrar(Veiculos veiculos);
    
    void atualizar(Veiculos veiculos);
    
    void excluir(Veiculos veiculos);
    
    List<Veiculos> listarTodos();
    
    Veiculos listarUm(Long id);
}
