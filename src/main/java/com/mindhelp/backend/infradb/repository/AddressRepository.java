package com.mindhelp.backend.infradb.repository;

import com.mindhelp.backend.infradb.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
