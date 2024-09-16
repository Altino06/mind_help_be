package com.mindhelp.backend.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class FormDTO {
    @NotNull(message = "o formulário não pode estar nulo.")
    private String formJson;

    private PacientDTO pacient;
}
