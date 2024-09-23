package com.mindhelp.backend.domain.impl;

import com.mindhelp.backend.app.dto.DoctorDTO;
import com.mindhelp.backend.domain.DoctorDomain;
import com.mindhelp.backend.domain.exception.NotFoundException;
import com.mindhelp.backend.domain.exception.ObjectsAreEqualsException;
import com.mindhelp.backend.domain.mapper.AvaiableConsulDateMapper;
import com.mindhelp.backend.domain.mapper.DoctorMapper;
import com.mindhelp.backend.domain.utils.ExceptionMessages;
import com.mindhelp.backend.infradb.model.Doctor;
import com.mindhelp.backend.infradb.repository.DoctorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorDomainImpl implements DoctorDomain {


    @Autowired
    private DoctorRepository DoctorRepository;

    @Autowired
    private DoctorMapper mapper;

    @Autowired
    private AvaiableConsulDateMapper avaiableConsulDateMapper;

    @Override
    public List<DoctorDTO> getAllDoctors() {
        return DoctorRepository.findAll()
                .stream()
                .map(d -> mapper.toDTO(d))
                .collect(Collectors.toList());
    }

    @Override
    public DoctorDTO getDoctorById(Long id) {
        return DoctorRepository.findById(id)
                .map(d -> mapper.toDTO(d))
                .orElseThrow(() -> new NotFoundException(ExceptionMessages.DOCTOR_NOT_FOUND));
    }

    @Transactional
    @Override
    public void saveDoctor(DoctorDTO doctorDTO) {
        DoctorRepository.save(mapper.toEntity(doctorDTO));
    }

    @Transactional
    @Override
    public void updateDoctor(Long id, DoctorDTO doctorDTO) {
        Doctor updatedDoctor = mapper.toEntity(doctorDTO);
        Doctor Doctor = DoctorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(ExceptionMessages.DOCTOR_NOT_FOUND));

        if (Doctor.equals(updatedDoctor))
            throw new ObjectsAreEqualsException(ExceptionMessages.NO_VALUE_WAS_ALTERED);

        DoctorRepository.save(updatedDoctor);
    }

    @Transactional
    @Override
    public void deleteDoctor(Long id) {
        Doctor Doctor = DoctorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(ExceptionMessages.DOCTOR_NOT_FOUND));

        DoctorRepository.deleteById(id);
    }
}
