package com.mindhelp.backend.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class ConsultDateDTO {
  private PacientDTO pacient;
  private DoctorDTO doctor;
  private LocalDateTime consultDate;
}
