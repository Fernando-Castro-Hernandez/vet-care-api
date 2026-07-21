package mx.edu.tecdesoftware.vet_care_api.persistence.crud;

import mx.edu.tecdesoftware.vet_care_api.persistence.entity.Servicio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServicioCrudRepository extends CrudRepository<Servicio, Integer> {

    // SELECT * FROM servicios WHERE estado = ?
    List<Servicio> findByEstado(Boolean estado);
}
