package backend.emprego.impl;

import backend.emprego.impl.usecase.*;
import backend.emprego.spec.IEmprego;
import backend.emprego.spec.dto.EmpregoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpregoImpl implements IEmprego {

    @Autowired
    private BuscarEmpregos buscar;

    @Autowired
    private InserirEmprego inserir;

    @Autowired
    private AtualizarEmprego atualizar;

    @Autowired
    private RemoverEmprego remover;

    @Autowired
    private BuscarEmpregosPorFaixaSalarial buscarEmpregosPorFaixaSalarial;

    @Override
    public List<EmpregoDTO> buscarEmpregos() {
        return buscar.buscarEmpregos();
    }

    @Override
    public void removerEmprego(Integer id) {
        remover.removerEmprego(id);
    }

    @Override
    public void inserirEmprego(EmpregoDTO empregoDTO) {
        inserir.inserirEmprego(empregoDTO);
    }

    @Override
    public void atualizarEmprego(EmpregoDTO empregoDTO) {
        atualizar.atualizarEmprego(empregoDTO);
    }

    @Override
    public List<EmpregoDTO> buscarEmpregosPorFaixaSalarial(float salarioMenor, float salarioMaior){
        return buscarEmpregosPorFaixaSalarial.buscarEmpregosPorFaixaSalarial(salarioMenor, salarioMaior);
    }
}
