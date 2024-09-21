package com.mindhelp.backend.app.dto;

import com.mindhelp.backend.infradb.model.Consult;
import com.mindhelp.backend.infradb.model.Form;
import com.mindhelp.backend.infradb.model.Person;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class PacientDTO extends Person {

    private Consult consult;
}
