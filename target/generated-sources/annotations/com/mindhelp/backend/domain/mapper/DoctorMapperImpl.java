package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.AvaiableConsultDateDTO;
import com.mindhelp.backend.app.dto.DoctorDTO;
import com.mindhelp.backend.infradb.model.Address;
import com.mindhelp.backend.infradb.model.AvaiableConsultDate;
import com.mindhelp.backend.infradb.model.Doctor;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-24T19:43:08-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 22.0.2 (Amazon.com Inc.)"
)
@Component
public class DoctorMapperImpl implements DoctorMapper {

    @Override
    public Doctor toEntity(DoctorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Doctor.DoctorBuilder<?, ?> doctor = Doctor.builder();

        doctor.name( dto.getName() );
        doctor.gender( dto.getGender() );
        doctor.birthDate( dto.getBirthDate() );
        doctor.email( dto.getEmail() );
        doctor.password( dto.getPassword() );
        doctor.avaiableConsultDates( avaiableConsultDateDTOListToAvaiableConsultDateList( dto.getAvaiableConsultDates() ) );
        doctor.id( dto.getId() );
        List<Address> list1 = dto.getAddressList();
        if ( list1 != null ) {
            doctor.addressList( new ArrayList<Address>( list1 ) );
        }

        return doctor.build();
    }

    @Override
    public DoctorDTO toDTO(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        DoctorDTO.DoctorDTOBuilder<?, ?> doctorDTO = DoctorDTO.builder();

        doctorDTO.name( doctor.getName() );
        doctorDTO.gender( doctor.getGender() );
        doctorDTO.birthDate( doctor.getBirthDate() );
        doctorDTO.email( doctor.getEmail() );
        doctorDTO.password( doctor.getPassword() );
        doctorDTO.avaiableConsultDates( avaiableConsultDateListToAvaiableConsultDateDTOList( doctor.getAvaiableConsultDates() ) );
        doctorDTO.id( doctor.getId() );
        List<Address> list1 = doctor.getAddressList();
        if ( list1 != null ) {
            doctorDTO.addressList( new ArrayList<Address>( list1 ) );
        }

        return doctorDTO.build();
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
}
