package mx.edu.tecdesoftware.vet_care_api.persistence.crud;

import mx.edu.tecdesoftware.vet_care_api.persistence.entity.Dueno;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DuenoCrudRepository extends CrudRepository<Dueno, Integer> {

    // SELECT * FROM duenos WHERE apellidos = ? ORDER BY nombre ASC
    List<Dueno> findByApellidosOrderByNombreAsc(String apellidos);
}
