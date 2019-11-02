package backend.emprego.impl.usecase;

import backend.emprego.impl.bo.EmpregoBO;
import backend.emprego.spec.dto.EmpregoDTO;
import backend.emprego.spec.entity.Emprego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtualizarEmprego {
    @Autowired
    private EmpregoBO empregoBO;

    public void atualizarEmprego(EmpregoDTO empregoDTO) {
        Emprego emprego = empregoBO.buscarEmpregoPorId(empregoDTO.getId()) ;
        preencherEmprego(emprego, empregoDTO);
        empregoBO.atualizarEmprego(emprego);
    }

    private static void preencherEmprego(Emprego emprego, EmpregoDTO empregoDTO) {
        emprego.setId(empregoDTO.getId());
        emprego.setDescricao(empregoDTO.getDescricao());
        emprego.setContato(empregoDTO.getContato());
        emprego.setRequisito(empregoDTO.getRequisito());
        emprego.setSalario(empregoDTO.getSalario());
    }
}