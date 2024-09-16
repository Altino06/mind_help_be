package com.mindhelp.backend.domain.impl;

import com.mindhelp.backend.app.dto.FormDTO;
import com.mindhelp.backend.domain.FormDomain;
import com.mindhelp.backend.domain.mapper.FormMapper;
import com.mindhelp.backend.infradb.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FormDomainImpl implements FormDomain {

    @Autowired
    private FormRepository formRepository;

    @Autowired
    private FormMapper mapper;

    @Override
    public void saveForm(FormDTO formDTO) {
        formRepository.save(mapper.toEntity(formDTO));
    }

    @Override
    public List<FormDTO> getAllForms() {

        return formRepository.findAll()
                .stream()
                .map(e -> mapper.toDTO(e))
                .collect(Collectors.toList());
    }
}
