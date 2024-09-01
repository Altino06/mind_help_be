package com.mindhelp.backend.domain;

import com.mindhelp.backend.app.dto.PacientDTO;
import org.springframework.stereotype.Service;

@Service
public interface PacientDomain {

    PacientDTO getPacientById(Long id);
}
