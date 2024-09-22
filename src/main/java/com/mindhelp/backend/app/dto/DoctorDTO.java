package com.mindhelp.backend.app.dto;

import com.mindhelp.backend.infradb.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = true)
public class DoctorDTO extends Person {
    private List<AvaiableConsultDateDTO> avaiableConsultDateList;
    private List<ConsultDTO> consultList;
}
