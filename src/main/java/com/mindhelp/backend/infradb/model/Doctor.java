package com.mindhelp.backend.infradb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Entity
@EqualsAndHashCode(callSuper = true)
public class Doctor extends Person {

    private List<LocalDateTime> availableConsultDates = new ArrayList<>();
}
