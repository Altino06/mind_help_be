package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.DoctorDTO;
import com.mindhelp.backend.app.dto.PacientDTO;
import com.mindhelp.backend.infradb.model.Doctor;
import com.mindhelp.backend.infradb.model.Pacient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    @Mapping(target = "name", source = "dto.name")
    @Mapping(target = "gender", source = "dto.gender")
    @Mapping(target = "birthDate", source = "dto.birthDate")
    @Mapping(target = "email", source = "dto.email")
    @Mapping(target = "password", source = "dto.password ")
    @Mapping(target = "avaiableConsultDateList", source = "dto.avaiableConsultDateList")
    @Mapping(target = "consultList", source = "dto.consultList")
    Doctor toEntity(DoctorDTO dto);

    @Mapping(target = "name", source = "doctor.name")
    @Mapping(target = "gender", source = "doctor.gender")
    @Mapping(target = "birthDate", source = "doctor.birthDate")
    @Mapping(target = "email", source = "doctor.email")
    @Mapping(target = "password", source = "doctor.password ")
    @Mapping(target = "avaiableConsultDateList", source = "doctor.avaiableConsultDateList")
    @Mapping(target = "consultList", source = "doctor.consultList")
    DoctorDTO toDTO(Doctor doctor);
}

