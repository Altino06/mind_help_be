package com.mindhelp.backend.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ConsultDTO {
  private PacientDTO pacient;
  private DoctorDTO doctor;
  private LocalDateTime consultDate;
}
