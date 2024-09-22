package com.mindhelp.backend.infradb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tb_pacient")
public class Pacient extends Person {

    @JsonIgnore
    @OneToOne(mappedBy = "pacient", cascade = CascadeType.ALL)
    private Form pacienteForm;

    @OneToOne(mappedBy = "pacient")
    private Consult consult;
}
