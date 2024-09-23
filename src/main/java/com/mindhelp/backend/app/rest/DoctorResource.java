package com.mindhelp.backend.app.rest;

import com.mindhelp.backend.app.dto.DoctorDTO;
import com.mindhelp.backend.app.utils.Utils;
import com.mindhelp.backend.domain.DoctorDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Utils.API_URL + "/doctor")
public class DoctorResource {

    @Autowired
    private DoctorDomain doctorDomain;

    @GetMapping
    public ResponseEntity<List<DoctorDTO>> getAll() {
        List<DoctorDTO> doctorDTOList = doctorDomain.getAllDoctors();
        return ResponseEntity.ok().body(doctorDTOList);
    }

    @GetMapping("findById")
    public ResponseEntity<DoctorDTO> getById(@RequestParam("doctor_id") Long id) {
        DoctorDTO doctor = doctorDomain.getDoctorById(id);
        return ResponseEntity.ok().body(doctor);
    }

    @PostMapping("/saveDoctor")
    public ResponseEntity<Void> savePacient(@RequestBody DoctorDTO doctorDTO) {
        doctorDomain.saveDoctor(doctorDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PatchMapping("/updateDoctor")
    public ResponseEntity<Void> savePacient(@RequestParam("doctor_id") Long id, @RequestBody DoctorDTO doctorDTO) {
        doctorDomain.updateDoctor(id, doctorDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deletePacient")
    public ResponseEntity<Void> deletePacient(@RequestParam("doctor_id") Long id) {
        doctorDomain.deleteDoctor(id);
        return ResponseEntity.noContent().build();
    }
}
