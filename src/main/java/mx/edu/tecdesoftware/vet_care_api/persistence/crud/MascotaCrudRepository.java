package mx.edu.tecdesoftware.vet_care_api.persistence.crud;

import mx.edu.tecdesoftware.vet_care_api.persistence.entity.Mascota;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MascotaCrudRepository extends CrudRepository<Mascota, Integer> {

    // SELECT * FROM mascotas WHERE id_dueno = ?
    List<Mascota> findByIdDueno(Integer idDueno);
}
