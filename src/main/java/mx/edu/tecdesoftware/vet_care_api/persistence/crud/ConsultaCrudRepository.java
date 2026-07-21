package mx.edu.tecdesoftware.vet_care_api.persistence.crud;

import mx.edu.tecdesoftware.vet_care_api.persistence.entity.Consulta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConsultaCrudRepository extends CrudRepository<Consulta, Integer> {

    // SELECT * FROM consultas WHERE id_mascota = ? ORDER BY fecha DESC
    List<Consulta> findByIdMascotaOrderByFechaDesc(Integer idMascota);
}
