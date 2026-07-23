package mx.edu.tecdesoftware.vet_care_api.persistence.mapper;

import mx.edu.tecdesoftware.vet_care_api.domain.Pet;
import mx.edu.tecdesoftware.vet_care_api.persistence.entity.Mascota;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ConsultMapper.class})
public interface PetMapper {

    @Mappings({
            @Mapping(source = "idMascota", target = "petId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "especie", target = "species"),
            @Mapping(source = "raza", target = "breed"),
            @Mapping(source = "sexo", target = "sex"),
            @Mapping(source = "fechaNacimiento", target = "birthDate"),
            @Mapping(source = "peso", target = "weight"),
            @Mapping(source = "idDueno", target = "ownerId"),
            @Mapping(source = "consultas", target = "consults")
    })
    Pet toPet(Mascota mascota);
    List<Pet> toPets(List<Mascota> mascotas);

    @InheritInverseConfiguration
    @Mapping(target = "dueno", ignore = true)
    Mascota toMascota(Pet pet);
}
