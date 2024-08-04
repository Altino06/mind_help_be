package com.mindhelp.backend.infradb.testDB;

import com.mindhelp.backend.infradb.model.Address;
import com.mindhelp.backend.infradb.model.Doctor;
import com.mindhelp.backend.infradb.model.Pacient;
import com.mindhelp.backend.infradb.model.Person;
import com.mindhelp.backend.infradb.repository.AddressRepository;
import com.mindhelp.backend.infradb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
@Profile("dev")
public class TestDB implements CommandLineRunner {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PersonRepository personRepository;


    @Override
    public void run(String... args) throws Exception {

        Address adPacient = Address.builder()
                .street("street 1")
                .number(21)
                .city("Los Angeles")
                .state("California")
                .build();

        Address adDoctor = Address.builder()
                .street("street 3")
                .number(56)
                .city("Los Angeles")
                .state("California")
                .build();

        Person doc = Doctor.builder()
                .id(1L)
                .name("Gabriel")
                .birthDate(LocalDate.of(1999, 10, 16))
                .addressList(Arrays.asList(adDoctor))
                .gender("male")
                .availableConsultDates(Arrays.asList(LocalDateTime.now()))
                .build();

        Person pac = Pacient.builder()
                .id(2L)
                .name("Matheus")
                .birthDate(LocalDate.of(1999, 05, 01))
                .addressList(Arrays.asList(adPacient))
                .gender("male")
                .consultDate(LocalDateTime.now())
                .build();

        adPacient.setPerson(pac);
        adDoctor.setPerson(doc);

        personRepository.saveAll(Arrays.asList(pac, doc));
        addressRepository.saveAll(Arrays.asList(adDoctor, adPacient));
    }


}
