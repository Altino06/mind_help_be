package com.mindhelp.backend.domain.impl;

import com.mindhelp.backend.app.dto.FormDTO;
import com.mindhelp.backend.domain.MatcherDomain;
import com.mindhelp.backend.infradb.repository.DoctorRepository;
import com.mindhelp.backend.infradb.repository.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatcherDomainImpl implements MatcherDomain {

    @Autowired
    private PacientRepository pacientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public void doMatchConsult(FormDTO formDTO) {
        JsonMapper mapper = JsonMapper.builder()
                .enable(JsonMapper.Feature.AUTO_DETECT_FIELDS)
                .build();
    }
}
