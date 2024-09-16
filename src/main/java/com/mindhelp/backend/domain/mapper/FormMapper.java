package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.FormDTO;
import com.mindhelp.backend.infradb.model.Form;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FormMapper {

    @Mapping(target = "pacient", source = "dto.pacient")
    @Mapping(target = "formJson", source = "dto.formJson")
    Form toEntity(FormDTO dto);

    @Mapping(target = "pacient", source = "form.pacient")
    @Mapping(target = "formJson", source = "form.formJson")
    FormDTO toDTO(Form form);

}
