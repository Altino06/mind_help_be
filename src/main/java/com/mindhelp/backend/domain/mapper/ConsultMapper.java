package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.ConsultDTO;
import com.mindhelp.backend.infradb.model.Consult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ConsultMapper {

    @Mapping(target = "pacient", source = "dto.pacient")
    @Mapping(target = "doctor", source = "dto.doctor")
    @Mapping(target = "consultDate", source = "dto.consultDate")
    Consult toEntity(ConsultDTO dto);

    @Mapping(target = "pacient", source = "consult.pacient")
    @Mapping(target = "doctor", source = "consult.doctor")
    @Mapping(target = "consultDate", source = "consult.consultDate")
    ConsultDTO toDTO(Consult consult);
}
