package com.mindhelp.backend.infradb.repository;

import com.mindhelp.backend.infradb.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
