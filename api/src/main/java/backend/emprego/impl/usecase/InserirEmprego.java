package backend.emprego.impl.usecase;

import backend.emprego.impl.bo.EmpregoBO;
import backend.emprego.spec.dto.EmpregoDTO;
import backend.emprego.spec.entity.Emprego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirEmprego {

    @Autowired
    private EmpregoBO empregoBO;

    public void inserirEmprego(EmpregoDTO empregoDTO) {
        Emprego emprego = new Emprego();
        preencherEmprego(emprego, empregoDTO);
        empregoBO.inserirEmprego(emprego);
    }

    private static void preencherEmprego(Emprego emprego, EmpregoDTO empregoDTO) {
        emprego.setDescricao(empregoDTO.getDescricao());
        emprego.setContato(empregoDTO.getContato());
        emprego.setRequisito(empregoDTO.getRequisito());
        emprego.setSalario(empregoDTO.getSalario());
    }
}
