package com.mindhelp.backend.infradb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tb_avaiable_consult_date")
public class AvaiableConsultDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime avaiableConsultDate;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Person doctor;
}
