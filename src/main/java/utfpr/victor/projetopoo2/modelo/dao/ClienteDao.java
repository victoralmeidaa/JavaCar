/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    Cliente listarUm(Long id);
    List<Cliente> listarTodos();    
    
}
