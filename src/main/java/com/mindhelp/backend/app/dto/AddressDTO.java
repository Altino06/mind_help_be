package com.mindhelp.backend.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class AddressDTO {
/*    private Long id;*/
    private String street;
    private Integer number;
    private String city;
    private String state;
}
