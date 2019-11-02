package backend.emprego.spec.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "TB_EMPREGO")
public class Emprego implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EM_ID")
    private Integer id;

    @Column(name = "EM_DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "EM_REQUISITO", nullable = false)
    private String requisito;

    @Column(name = "EM_SALARIO", nullable = false)
    private float salario;

    @Column(name = "EM_CONTATO", nullable = false)
    private String contato;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
