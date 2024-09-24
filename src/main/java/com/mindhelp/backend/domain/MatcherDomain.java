package com.mindhelp.backend.domain;

import com.mindhelp.backend.app.dto.FormDTO;
import org.springframework.stereotype.Service;

@Service
public interface MatcherDomain {

    void doMatchConsult(FormDTO formDTO);
}
