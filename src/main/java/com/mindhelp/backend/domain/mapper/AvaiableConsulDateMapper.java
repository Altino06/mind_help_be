package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.AvaiableConsultDateDTO;
import com.mindhelp.backend.infradb.model.AvaiableConsultDate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AvaiableConsulDateMapper {

    @Mapping(target = "avaiableConsultDate", source = "dto.avaiableConsultDate")
    AvaiableConsultDate toEntity(AvaiableConsultDateDTO dto);

    @Mapping(target = "avaiableConsultDate", source = "avaiableConsultDate.avaiableConsultDate")
    AvaiableConsultDateDTO toDTO(AvaiableConsultDate avaiableConsultDate);
}
