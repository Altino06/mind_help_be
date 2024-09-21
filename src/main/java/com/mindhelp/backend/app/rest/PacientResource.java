package com.mindhelp.backend.app.rest;

import com.mindhelp.backend.app.dto.FormDTO;
import com.mindhelp.backend.app.dto.PacientDTO;
import com.mindhelp.backend.app.utils.Utils;
import com.mindhelp.backend.domain.FormDomain;
import com.mindhelp.backend.domain.PacientDomain;
import jdk.javadoc.doclet.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
