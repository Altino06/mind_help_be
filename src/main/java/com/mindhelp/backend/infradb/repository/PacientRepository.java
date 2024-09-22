package com.mindhelp.backend.infradb.repository;

import com.mindhelp.backend.infradb.model.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PacientRepository extends JpaRepository<Pacient , Long> {

/*    Optional<Pacient> findPacientById(Long id);*/
}
