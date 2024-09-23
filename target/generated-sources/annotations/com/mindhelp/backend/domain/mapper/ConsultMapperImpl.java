package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.AvaiableConsultDateDTO;
import com.mindhelp.backend.app.dto.ConsultDTO;
import com.mindhelp.backend.app.dto.DoctorDTO;
import com.mindhelp.backend.app.dto.PacientDTO;
import com.mindhelp.backend.infradb.model.Address;
import com.mindhelp.backend.infradb.model.AvaiableConsultDate;
import com.mindhelp.backend.infradb.model.Consult;
import com.mindhelp.backend.infradb.model.Doctor;
import com.mindhelp.backend.infradb.model.Pacient;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-23T19:52:27-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.3 (JetBrains s.r.o.)"
)
@Component
public class ConsultMapperImpl implements ConsultMapper {

    @Override
    public Consult toEntity(ConsultDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Consult.ConsultBuilder consult = Consult.builder();

        consult.pacient( pacientDTOToPacient( dto.getPacient() ) );
        consult.doctor( doctorDTOToDoctor( dto.getDoctor() ) );
        consult.consultDate( dto.getConsultDate() );

        return consult.build();
    }

    @Override
    public ConsultDTO toDTO(Consult consult) {
        if ( consult == null ) {
            return null;
        }

        ConsultDTO.ConsultDTOBuilder consultDTO = ConsultDTO.builder();

        consultDTO.pacient( pacientToPacientDTO( consult.getPacient() ) );
        consultDTO.doctor( doctorToDoctorDTO( consult.getDoctor() ) );
        consultDTO.consultDate( consult.getConsultDate() );

        return consultDTO.build();
    }

    protected Pacient pacientDTOToPacient(PacientDTO pacientDTO) {
        if ( pacientDTO == null ) {
            return null;
        }

        Pacient.PacientBuilder<?, ?> pacient = Pacient.builder();

        pacient.id( pacientDTO.getId() );
        pacient.name( pacientDTO.getName() );
        pacient.gender( pacientDTO.getGender() );
        pacient.birthDate( pacientDTO.getBirthDate() );
        pacient.email( pacientDTO.getEmail() );
        pacient.password( pacientDTO.getPassword() );
        List<Address> list = pacientDTO.getAddressList();
        if ( list != null ) {
            pacient.addressList( new ArrayList<Address>( list ) );
        }
        pacient.consult( pacientDTO.getConsult() );

        return pacient.build();
    }

    protected AvaiableConsultDate avaiableConsultDateDTOToAvaiableConsultDate(AvaiableConsultDateDTO avaiableConsultDateDTO) {
        if ( avaiableConsultDateDTO == null ) {
            return null;
        }

        AvaiableConsultDate.AvaiableConsultDateBuilder avaiableConsultDate = AvaiableConsultDate.builder();

        avaiableConsultDate.avaiableConsultDate( avaiableConsultDateDTO.getAvaiableConsultDate() );

        return avaiableConsultDate.build();
    }

    protected List<AvaiableConsultDate> avaiableConsultDateDTOListToAvaiableConsultDateList(List<AvaiableConsultDateDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<AvaiableConsultDate> list1 = new ArrayList<AvaiableConsultDate>( list.size() );
        for ( AvaiableConsultDateDTO avaiableConsultDateDTO : list ) {
            list1.add( avaiableConsultDateDTOToAvaiableConsultDate( avaiableConsultDateDTO ) );
        }

        return list1;
    }

    protected List<Consult> consultDTOListToConsultList(List<ConsultDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Consult> list1 = new ArrayList<Consult>( list.size() );
        for ( ConsultDTO consultDTO : list ) {
            list1.add( toEntity( consultDTO ) );
        }

        return list1;
    }

    protected Doctor doctorDTOToDoctor(DoctorDTO doctorDTO) {
        if ( doctorDTO == null ) {
            return null;
        }

        Doctor.DoctorBuilder<?, ?> doctor = Doctor.builder();

        doctor.id( doctorDTO.getId() );
        doctor.name( doctorDTO.getName() );
        doctor.gender( doctorDTO.getGender() );
        doctor.birthDate( doctorDTO.getBirthDate() );
        doctor.email( doctorDTO.getEmail() );
        doctor.password( doctorDTO.getPassword() );
        List<Address> list = doctorDTO.getAddressList();
        if ( list != null ) {
            doctor.addressList( new ArrayList<Address>( list ) );
        }
        doctor.avaiableConsultDates( avaiableConsultDateDTOListToAvaiableConsultDateList( doctorDTO.getAvaiableConsultDates() ) );
        doctor.consultList( consultDTOListToConsultList( doctorDTO.getConsultList() ) );

        return doctor.build();
    }

    protected PacientDTO pacientToPacientDTO(Pacient pacient) {
        if ( pacient == null ) {
            return null;
        }

        PacientDTO.PacientDTOBuilder<?, ?> pacientDTO = PacientDTO.builder();

        pacientDTO.id( pacient.getId() );
        pacientDTO.name( pacient.getName() );
        pacientDTO.gender( pacient.getGender() );
        pacientDTO.birthDate( pacient.getBirthDate() );
        pacientDTO.email( pacient.getEmail() );
        pacientDTO.password( pacient.getPassword() );
        List<Address> list = pacient.getAddressList();
        if ( list != null ) {
            pacientDTO.addressList( new ArrayList<Address>( list ) );
        }
        pacientDTO.consult( pacient.getConsult() );

        return pacientDTO.build();
    }

    protected AvaiableConsultDateDTO avaiableConsultDateToAvaiableConsultDateDTO(AvaiableConsultDate avaiableConsultDate) {
        if ( avaiableConsultDate == null ) {
            return null;
        }

        AvaiableConsultDateDTO.AvaiableConsultDateDTOBuilder avaiableConsultDateDTO = AvaiableConsultDateDTO.builder();

        avaiableConsultDateDTO.avaiableConsultDate( avaiableConsultDate.getAvaiableConsultDate() );

        return avaiableConsultDateDTO.build();
    }

    protected List<AvaiableConsultDateDTO> avaiableConsultDateListToAvaiableConsultDateDTOList(List<AvaiableConsultDate> list) {
        if ( list == null ) {
            return null;
        }

        List<AvaiableConsultDateDTO> list1 = new ArrayList<AvaiableConsultDateDTO>( list.size() );
        for ( AvaiableConsultDate avaiableConsultDate : list ) {
            list1.add( avaiableConsultDateToAvaiableConsultDateDTO( avaiableConsultDate ) );
        }

        return list1;
    }

    protected List<ConsultDTO> consultListToConsultDTOList(List<Consult> list) {
        if ( list == null ) {
            return null;
        }

        List<ConsultDTO> list1 = new ArrayList<ConsultDTO>( list.size() );
        for ( Consult consult : list ) {
            list1.add( toDTO( consult ) );
        }

        return list1;
    }

    protected DoctorDTO doctorToDoctorDTO(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        DoctorDTO.DoctorDTOBuilder<?, ?> doctorDTO = DoctorDTO.builder();

        doctorDTO.id( doctor.getId() );
        doctorDTO.name( doctor.getName() );
        doctorDTO.gender( doctor.getGender() );
        doctorDTO.birthDate( doctor.getBirthDate() );
        doctorDTO.email( doctor.getEmail() );
        doctorDTO.password( doctor.getPassword() );
        List<Address> list = doctor.getAddressList();
        if ( list != null ) {
            doctorDTO.addressList( new ArrayList<Address>( list ) );
        }
        doctorDTO.avaiableConsultDates( avaiableConsultDateListToAvaiableConsultDateDTOList( doctor.getAvaiableConsultDates() ) );
        doctorDTO.consultList( consultListToConsultDTOList( doctor.getConsultList() ) );

        return doctorDTO.build();
    }
}
