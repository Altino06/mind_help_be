package com.mindhelp.backend.infradb.repository;

import com.mindhelp.backend.infradb.model.Consult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultRepository extends JpaRepository<Consult, Long> {
}
