package utfpr.victor.projetopoo2.modelo.vo;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author victo
 */
@Entity

//@Table(name = "tb_Funcionario")

public class Funcionario extends Pessoa {
    private double salario;
    
    @OneToMany(mappedBy = "funcionario")
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
