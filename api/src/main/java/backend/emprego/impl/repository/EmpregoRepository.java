package backend.emprego.impl.repository;

import backend.emprego.spec.entity.Emprego;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpregoRepository extends JpaRepository<Emprego, Integer> {

    List<Emprego> findAllBySalarioIsGreaterThanEqualAndSalarioIsLessThanEqual(float salarioMenor, float salarioMaior);
}