package backend.emprego.service;

import backend.emprego.spec.IEmprego;
import backend.emprego.spec.dto.EmpregoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class EmpregoService {

    @Autowired
    private IEmprego iEmprego;

    @GetMapping("/empregos")
    @CrossOrigin
    public List<EmpregoDTO> buscarEmpregos() {
        return iEmprego.buscarEmpregos();
    }

    @GetMapping("/empregos/{salarioMenor}/{salarioMaior}")
    @CrossOrigin
    public List<EmpregoDTO> buscarEmpregosPorFaixaSalarial(@PathVariable(value = "salarioMenor") float salarioMenor, @PathVariable(value = "salarioMaior") float salarioMaior) {
        return iEmprego.buscarEmpregosPorFaixaSalarial(salarioMenor, salarioMaior);
    }

    @PostMapping("/emprego/inserir")
    @CrossOrigin
    public void inserirEmprego(@RequestBody EmpregoDTO empregoDTO) {
        iEmprego.inserirEmprego(empregoDTO);
    }

    @DeleteMapping("/emprego/{empregoId}")
    @CrossOrigin
    public void removerEmprego(@PathVariable(value = "empregoId") Integer empregoId) {
        iEmprego.removerEmprego(empregoId);
    }

    @PutMapping("/emprego/atualizar")
    @CrossOrigin
    public void atualizaEmprego(@RequestBody EmpregoDTO empregoDTO) {
        iEmprego.atualizarEmprego(empregoDTO);
    }
}