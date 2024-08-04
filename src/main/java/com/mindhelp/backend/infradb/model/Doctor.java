package com.mindhelp.backend.infradb.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Doctor {
    private Long id;
    private String name;
    private LocalDate birthday;
    private String gender;
    

}
