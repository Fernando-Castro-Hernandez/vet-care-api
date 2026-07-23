package mx.edu.tecdesoftware.vet_care_api.persistence.mapper;

import mx.edu.tecdesoftware.vet_care_api.domain.Owner;
import mx.edu.tecdesoftware.vet_care_api.persistence.entity.Dueno;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PetMapper.class})
public interface OwnerMapper {

    @Mappings({
            @Mapping(source = "idDueno", target = "ownerId"),
            @Mapping(source = "nombre", target = "firstName"),
            @Mapping(source = "apellidos", target = "lastName"),
            @Mapping(source = "telefono", target = "phone"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "mascotas", target = "pets")
    })
    Owner toOwner(Dueno dueno);
    List<Owner> toOwners(List<Dueno> duenos);

    @InheritInverseConfiguration
    Dueno toDueno(Owner owner);
}
