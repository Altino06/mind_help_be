package com.mindhelp.backend.domain;

import com.mindhelp.backend.app.dto.FormDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FormDomain {

    void saveForm(FormDTO formDTO);
    List<FormDTO> getAllForms();
}
