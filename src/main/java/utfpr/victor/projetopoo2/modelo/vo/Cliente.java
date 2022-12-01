package utfpr.victor.projetopoo2.modelo.vo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author victo
 */
@Entity
public class Cliente extends Pessoa {
    @OneToMany(mappedBy = "cliente")
    // List<venda> Vendas;
    @Embedded
    private Endereco endereco;
}
