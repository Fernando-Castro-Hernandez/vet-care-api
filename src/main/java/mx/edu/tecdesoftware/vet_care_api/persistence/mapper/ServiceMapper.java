package mx.edu.tecdesoftware.vet_care_api.persistence.mapper;

import mx.edu.tecdesoftware.vet_care_api.domain.Service;
import mx.edu.tecdesoftware.vet_care_api.persistence.entity.Servicio;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceMapper {

    @Mappings({
            @Mapping(source = "idServicio", target = "serviceId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "estado", target = "active")
    })
    Service toService(Servicio servicio);
    List<Service> toServices(List<Servicio> servicios);

    @InheritInverseConfiguration
    @Mapping(target = "consultaServicios", ignore = true)
    Servicio toServicio(Service service);
}
