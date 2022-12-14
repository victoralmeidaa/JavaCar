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
@Table(name = "tb_servico")

public class Servico {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Servico(String descricao, String titulo) {
        this.descricao = descricao;
        this.titulo = titulo;
    }

    private String descricao;
    
    private String titulo;

    public Servico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }   
}
