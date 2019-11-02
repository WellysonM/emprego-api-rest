package backend.emprego.impl.usecase;

import backend.emprego.impl.bo.EmpregoBO;
import backend.emprego.spec.dto.EmpregoDTO;
import backend.emprego.spec.entity.Emprego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BuscarEmpregos {

    @Autowired
    private EmpregoBO empregoBO;

    public List<EmpregoDTO> buscarEmpregos() {
        List<Emprego> empregos = empregoBO.buscarEmpregos();
        return converterEmpregoParaDTO(empregos);
    }

    private List<EmpregoDTO> converterEmpregoParaDTO(List<Emprego> empregos) {
        List<EmpregoDTO> empregoDTO = new ArrayList<>();
        empregos.forEach(emprego -> empregoDTO.add(montarEmpregoDTO(emprego)));
        return empregoDTO;
    }

    private static EmpregoDTO montarEmpregoDTO(Emprego emprego) {
        EmpregoDTO empregoDTO = new EmpregoDTO(emprego);
        return empregoDTO;
    }
}
