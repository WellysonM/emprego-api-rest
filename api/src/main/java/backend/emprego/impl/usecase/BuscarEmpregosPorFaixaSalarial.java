package backend.emprego.impl.usecase;

import backend.emprego.impl.bo.EmpregoBO;
import backend.emprego.spec.dto.EmpregoDTO;
import backend.emprego.spec.entity.Emprego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BuscarEmpregosPorFaixaSalarial {

    @Autowired
    private EmpregoBO empregoBO;

    public List<EmpregoDTO> buscarEmpregosPorFaixaSalarial(float salarioMenor, float salarioMaior) {
        List<Emprego> empregos = empregoBO.buscarEmpregosPorFaixaSalarial(salarioMenor, salarioMaior);
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
