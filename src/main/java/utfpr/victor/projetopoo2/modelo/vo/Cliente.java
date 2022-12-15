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
    private Integer idCli;
    
    @OneToMany(mappedBy = "cliente")
    
    public Integer getIdCli() {
        return idCli;
    }
    
    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }
}
