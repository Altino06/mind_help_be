package com.mindhelp.backend.app.dto;

import com.mindhelp.backend.infradb.model.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PersonDTO {
    private Long id;
    private String name;
    private String gender;
    private LocalDate birthDate;
    private String email;
    private String password;
    private List<Address> addressList;
}
