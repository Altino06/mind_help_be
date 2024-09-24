package com.mindhelp.backend.app.rest;

import com.mindhelp.backend.app.dto.PacientDTO;
import com.mindhelp.backend.app.utils.Utils;
import com.mindhelp.backend.domain.PacientDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Utils.API_URL + "/pacient")
public class PacientResource {

    @Autowired
    private PacientDomain pacientDomain;

    @GetMapping("findById")
    public ResponseEntity<PacientDTO> getById(@RequestParam("pacient_id") Long id) {
        PacientDTO pacient = pacientDomain.getPacientById(id);
        return ResponseEntity.ok().body(pacient);
    }

    @GetMapping
    public ResponseEntity<List<PacientDTO>> findAll() {
        List<PacientDTO> pacients = pacientDomain.getAllPacient();
        return ResponseEntity.ok().body(pacients);
    }

    @PostMapping("/savePacient")
    public ResponseEntity<Void> savePacient(@RequestBody PacientDTO pacientDTO) {
        pacientDomain.savePacient(pacientDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PatchMapping("/updatePacient")
    public ResponseEntity<Void> savePacient(@RequestParam("pacient_id") Long id, @RequestBody PacientDTO pacientDTO) {
        pacientDomain.updatePacient(id, pacientDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deletePacient")
    public ResponseEntity<Void> deletePacient(@RequestParam("pacient_id") Long id) {
        pacientDomain.deletePacient(id);
        return ResponseEntity.noContent().build();
    }


}
