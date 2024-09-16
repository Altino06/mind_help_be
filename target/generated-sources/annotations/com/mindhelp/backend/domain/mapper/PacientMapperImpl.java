package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.PacientDTO;
import com.mindhelp.backend.infradb.model.Address;
import com.mindhelp.backend.infradb.model.Consult;
import com.mindhelp.backend.infradb.model.Pacient;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-15T22:36:05-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.3 (JetBrains s.r.o.)"
)
@Component
public class PacientMapperImpl implements PacientMapper {

    @Override
    public Pacient toEntity(PacientDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Pacient.PacientBuilder<?, ?> pacient = Pacient.builder();

        pacient.name( dto.getName() );
        pacient.gender( dto.getGender() );
        pacient.birthDate( dto.getBirthDate() );
        pacient.email( dto.getEmail() );
        pacient.password( dto.getPassword() );
        pacient.id( dto.getId() );
        List<Address> list = dto.getAddressList();
        if ( list != null ) {
            pacient.addressList( new ArrayList<Address>( list ) );
        }
        List<Consult> list1 = dto.getConsultList();
        if ( list1 != null ) {
            pacient.consultList( new ArrayList<Consult>( list1 ) );
        }

        return pacient.build();
    }

    @Override
    public PacientDTO toDTO(Pacient pacient) {
        if ( pacient == null ) {
            return null;
        }

        PacientDTO.PacientDTOBuilder<?, ?> pacientDTO = PacientDTO.builder();

        pacientDTO.name( pacient.getName() );
        pacientDTO.gender( pacient.getGender() );
        pacientDTO.birthDate( pacient.getBirthDate() );
        pacientDTO.email( pacient.getEmail() );
        pacientDTO.password( pacient.getPassword() );
        pacientDTO.id( pacient.getId() );
        List<Address> list = pacient.getAddressList();
        if ( list != null ) {
            pacientDTO.addressList( new ArrayList<Address>( list ) );
        }
        List<Consult> list1 = pacient.getConsultList();
        if ( list1 != null ) {
            pacientDTO.consultList( new ArrayList<Consult>( list1 ) );
        }

        return pacientDTO.build();
    }
}
