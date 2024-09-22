package com.mindhelp.backend.domain.impl;

import com.mindhelp.backend.app.dto.PacientDTO;
import com.mindhelp.backend.domain.PacientDomain;
import com.mindhelp.backend.domain.exception.NotFoundException;
import com.mindhelp.backend.domain.exception.ObjectsAreEqualsException;
import com.mindhelp.backend.domain.mapper.PacientMapper;
import com.mindhelp.backend.domain.utils.ExceptionMessages;
import com.mindhelp.backend.infradb.model.Pacient;
import com.mindhelp.backend.infradb.repository.PacientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacientDomainImpl implements PacientDomain {

    @Autowired
    private PacientRepository pacientRepository;

    @Autowired
    private PacientMapper mapper;

    @Override
    public List<PacientDTO> getAllPacient() {
        return pacientRepository.findAll()
                .stream()
                .map(p -> mapper.toDTO(p))
                .collect(Collectors.toList());
    }

    @Override
    public PacientDTO getPacientById(Long id) {
        return pacientRepository.findById(id)
                .map(p -> mapper.toDTO(p))
                .orElseThrow(() -> new NotFoundException(ExceptionMessages.PACIENT_NOT_FOUND));
    }

    @Transactional
    @Override
    public void savePacient(PacientDTO pacientDTO) {
        pacientRepository.save(mapper.toEntity(pacientDTO));
    }

    @Transactional
    @Override
    public void updatePacient(Long id, PacientDTO pacientDTO) {
        Pacient updatedPacient = mapper.toEntity(pacientDTO);
        Pacient pacient = pacientRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(ExceptionMessages.PACIENT_NOT_FOUND));

        if (pacient.equals(updatedPacient))
            throw new ObjectsAreEqualsException(ExceptionMessages.NO_VALUE_WAS_ALTERED);

        pacientRepository.save(updatedPacient);
    }

    @Transactional
    @Override
    public void deletePacient(Long id) {
        Pacient pacient = pacientRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(ExceptionMessages.PACIENT_NOT_FOUND));

        pacientRepository.deleteById(id);
    }
}
