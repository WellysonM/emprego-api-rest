package backend.emprego.impl.usecase;

import backend.emprego.impl.bo.EmpregoBO;
import backend.emprego.spec.entity.Emprego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RemoverEmprego {

    @Autowired
    private EmpregoBO empregoBO;

    public void removerEmprego(Integer id) {
        Emprego emprego = empregoBO.buscarEmpregoPorId(id);
        empregoBO.removerEmprego(emprego);
    }
}
