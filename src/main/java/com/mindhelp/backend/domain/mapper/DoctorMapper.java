package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.DoctorDTO;
import com.mindhelp.backend.infradb.model.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    @Mapping(target = "name", source = "dto.name")
    @Mapping(target = "gender", source = "dto.gender")
    @Mapping(target = "birthDate", source = "dto.birthDate")
    @Mapping(target = "email", source = "dto.email")
    @Mapping(target = "password", source = "dto.password ")
    @Mapping(target = "avaiableConsultDates", source = "dto.avaiableConsultDates")
    @Mapping(target = "consultList", ignore = true)
    Doctor toEntity(DoctorDTO dto);

    @Mapping(target = "name", source = "doctor.name")
    @Mapping(target = "gender", source = "doctor.gender")
    @Mapping(target = "birthDate", source = "doctor.birthDate")
    @Mapping(target = "email", source = "doctor.email")
    @Mapping(target = "password", source = "doctor.password ")
    @Mapping(target = "avaiableConsultDates", source = "doctor.avaiableConsultDates")
    @Mapping(target = "consultList", ignore = true)
    DoctorDTO toDTO(Doctor doctor);

}

