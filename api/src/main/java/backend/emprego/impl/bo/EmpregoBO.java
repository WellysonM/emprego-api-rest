package backend.emprego.impl.bo;

import backend.emprego.impl.repository.EmpregoRepository;
import backend.emprego.spec.entity.Emprego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpregoBO {

    @Autowired
    private EmpregoRepository empregoRepository;

    public List<Emprego> buscarEmpregos() {
        return empregoRepository.findAll(Sort.by("id").ascending());
    }

    public Emprego inserirEmprego(Emprego emprego) {
        return empregoRepository.save(emprego);
    }

    public Emprego atualizarEmprego(Emprego emprego) {
        return empregoRepository.save(emprego);
    }

    public Emprego buscarEmpregoPorId(Integer id) {
        return empregoRepository.findById(id).get();
    }

    public void removerEmprego(Emprego emprego) {
        empregoRepository.delete(emprego);
    }

    public List<Emprego> buscarEmpregosPorFaixaSalarial(float salarioMenor, float salarioMaior) {
        return empregoRepository.findAllBySalarioIsGreaterThanEqualAndSalarioIsLessThanEqual(salarioMenor, salarioMaior);
    }

}
