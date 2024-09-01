package com.mindhelp.backend.infradb.repository;

import com.mindhelp.backend.infradb.model.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Form, Long> {
}
