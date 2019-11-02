package backend.emprego.spec.dto;

import backend.emprego.spec.entity.Emprego;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EmpregoDTO {

    private Integer id;
    private String descricao;
    private String requisito;
    private float salario;
    private String contato;

    public EmpregoDTO(Emprego emprego) {
        this.id = emprego.getId();
        this.descricao = emprego.getDescricao();
        this.requisito = emprego.getRequisito();
        this.salario = emprego.getSalario();
        this.contato = emprego.getContato();
    }

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
