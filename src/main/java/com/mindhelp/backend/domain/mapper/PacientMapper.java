package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.PacientDTO;
import com.mindhelp.backend.infradb.model.Pacient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PacientMapper {

    @Mapping(target = "name", source = "dto.name")
    @Mapping(target = "gender", source = "dto.gender")
    @Mapping(target = "birthDate", source = "dto.birthDate")
    @Mapping(target = "email", source = "dto.email")
    @Mapping(target = "password", source = "dto.password ")
    Pacient toEntity(PacientDTO dto);

    @Mapping(target = "name", source = "pacient.name")
    @Mapping(target = "gender", source = "pacient.gender")
    @Mapping(target = "birthDate", source = "pacient.birthDate")
    @Mapping(target = "email", source = "pacient.email")
    @Mapping(target = "password", source = "pacient.password ")
    PacientDTO toDTO(Pacient pacient);
}

