package mx.edu.tecdesoftware.vet_care_api.persistence.mapper;

import mx.edu.tecdesoftware.vet_care_api.domain.ConsultService;
import mx.edu.tecdesoftware.vet_care_api.persistence.entity.ConsultaServicio;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ConsultServiceMapper {

    @Mappings({
            @Mapping(source = "id.idServicio", target = "serviceId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "estado", target = "active")
    })
    ConsultService toConsultService(ConsultaServicio consultaServicio);
    List<ConsultService> toConsultServices(List<ConsultaServicio> consultaServicios);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "consulta", ignore = true),
            @Mapping(target = "servicio", ignore = true)
    })
    ConsultaServicio toConsultaServicio(ConsultService consultService);
}
