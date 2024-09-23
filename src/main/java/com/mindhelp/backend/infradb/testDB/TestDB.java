package com.mindhelp.backend.infradb.testDB;

import com.mindhelp.backend.infradb.model.*;
import com.mindhelp.backend.infradb.repository.AddressRepository;
import com.mindhelp.backend.infradb.repository.AvaiableConsultDateRepository;
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

    @Autowired
    private AvaiableConsultDateRepository avaiableConsultDateRepository;


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

        AvaiableConsultDate avaiableConsultDate = AvaiableConsultDate.builder()
                .avaiableConsultDate(LocalDateTime.now())
                .build();

        Person doc = Doctor.builder()
                .name("Gabriel")
                .birthDate(LocalDate.of(1999, 10, 16))
                .addressList(Arrays.asList(adDoctor))
                .gender("male")
                .avaiableConsultDates(Arrays.asList(avaiableConsultDate))
                .build();

        Person pac = Pacient.builder()
                .name("Matheus")
                .birthDate(LocalDate.of(1999, 05, 01))
                .addressList(Arrays.asList(adPacient))
                .gender("male")
                .build();


        adDoctor.setPerson(doc);
        avaiableConsultDate.setDoctor(doc);
        adPacient.setPerson(pac);

        personRepository.saveAll(Arrays.asList(pac, doc));
        addressRepository.saveAll(Arrays.asList(adDoctor, adPacient));
        avaiableConsultDateRepository.save(avaiableConsultDate);

    }


}
