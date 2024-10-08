package com.mindhelp.backend.domain;

import com.mindhelp.backend.app.dto.DoctorDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorDomain {

    List<DoctorDTO> getAllDoctors();
    DoctorDTO getDoctorById(Long id);
    void saveDoctor(DoctorDTO doctorDTO);
    void updateDoctor(Long id, DoctorDTO doctorDTO);
    void deleteDoctor(Long id);
}
