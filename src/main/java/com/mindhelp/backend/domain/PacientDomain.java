package com.mindhelp.backend.domain;

import com.mindhelp.backend.app.dto.PacientDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PacientDomain {

    List<PacientDTO> getAllPacient();
    PacientDTO getPacientById(Long id);
    void savePacient(PacientDTO pacientDTO);
    void updatePacient(Long id, PacientDTO pacientDTO);
    void deletePacient(Long id);
}
