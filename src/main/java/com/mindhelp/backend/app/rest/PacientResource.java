package com.mindhelp.backend.app.rest;

import com.mindhelp.backend.app.dto.PacientDTO;
import com.mindhelp.backend.app.utils.Utils;
import com.mindhelp.backend.domain.PacientDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Utils.API_URL + "/pacient")
public class PacientResource {

    @Autowired
    private PacientDomain pacientDomain;

    @GetMapping
    public ResponseEntity<PacientDTO> getById(Long id) {
        PacientDTO pacient = pacientDomain.getPacientById(id);
        return ResponseEntity.ok().body(pacient);
    }
}
