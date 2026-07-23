package mx.edu.tecdesoftware.vet_care_api.persistence.mapper;

import mx.edu.tecdesoftware.vet_care_api.domain.Consult;
import mx.edu.tecdesoftware.vet_care_api.persistence.entity.Consulta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ConsultServiceMapper.class})
public interface ConsultMapper {

    @Mappings({
            @Mapping(source = "idConsulta", target = "consultId"),
            @Mapping(source = "idMascota", target = "petId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "motivo", target = "reason"),
            @Mapping(source = "diagnostico", target = "diagnosis"),
            @Mapping(source = "total", target = "total"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "consultaServicios", target = "consultServices")
    })
    Consult toConsult(Consulta consulta);
    List<Consult> toConsults(List<Consulta> consultas);

    @InheritInverseConfiguration
    @Mapping(target = "mascota", ignore = true)
    Consulta toConsulta(Consult consult);
}
