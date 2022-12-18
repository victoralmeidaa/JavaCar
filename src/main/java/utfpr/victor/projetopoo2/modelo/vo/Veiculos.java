package utfpr.victor.projetopoo2.modelo.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


/**
 *
 * @author victo
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_veiculos")

public class Veiculos {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String categoria;
    
    private String placa;
    
    private String cor;

    

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    

    public String getCategoria() {
        return categoria;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }
}
