package backend.emprego.spec;

import backend.emprego.spec.dto.EmpregoDTO;

import java.util.List;

public interface IEmprego {

    List<EmpregoDTO> buscarEmpregos();

    void removerEmprego(Integer id);

    void inserirEmprego(EmpregoDTO empregoDTO);

    void atualizarEmprego(EmpregoDTO empregoDTO);

    List<EmpregoDTO> buscarEmpregosPorFaixaSalarial(float salarioMenor, float salarioMaior);

}
