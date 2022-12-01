package utfpr.victor.projetopoo2.modelo.vo;

import javax.persistence.Embeddable;

/**
 *
 * @author victo
 */
@Embeddable
public class Endereco {
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private Integer numero;
    private Integer cep;
}
