package utfpr.victor.projetopoo2.modelo.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author victo
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

//@Table(name = "tb_servico")

public class Servico {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idServico;

    private String descricao;
    
    public long getIdServico() {
        return idServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setIdServico(long idServico) {
        this.idServico = idServico;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }   
}
