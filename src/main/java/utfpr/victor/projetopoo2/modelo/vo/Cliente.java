package utfpr.victor.projetopoo2.modelo.vo;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author victo
 */
@Entity
@Table(name = "tb_cliente")


public class Cliente extends Pessoa {
    private Integer contrato;
    
    @OneToMany(mappedBy = "cliente")

    public Integer getContrato() {
        return contrato;
    }

    public void setContrato(Integer contrato) {
        this.contrato = contrato;
    }
    

}
