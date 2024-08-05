package com.mindhelp.backend.infradb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_doctor")
public class Doctor extends Person {

    @OneToMany(mappedBy = "doctor")
    private List<AvaiableConsultDate> availableConsultDates = new ArrayList<>();
}
