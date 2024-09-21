package com.mindhelp.backend.app.rest;

import com.mindhelp.backend.app.dto.FormDTO;
import com.mindhelp.backend.app.utils.Utils;
import com.mindhelp.backend.domain.FormDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Utils.API_URL + "/form")
public class FormResource {

    @Autowired
    private FormDomain formDomain;

    @PostMapping
    public ResponseEntity<Void> saveForm(@RequestBody FormDTO formDTO) {
        formDomain.saveForm(formDTO);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<FormDTO>> getAllForms() {
        List<FormDTO> forms = formDomain.getAllForms();
        return ResponseEntity.ok().body(forms);
    }
}
