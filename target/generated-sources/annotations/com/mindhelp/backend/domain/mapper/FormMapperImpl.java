package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.FormDTO;
import com.mindhelp.backend.app.dto.PacientDTO;
import com.mindhelp.backend.infradb.model.Address;
import com.mindhelp.backend.infradb.model.Form;
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
public class FormMapperImpl implements FormMapper {

    @Override
    public Form toEntity(FormDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Form.FormBuilder form = Form.builder();

        form.pacient( pacientDTOToPacient( dto.getPacient() ) );
        form.formJson( dto.getFormJson() );

        return form.build();
    }

    @Override
    public FormDTO toDTO(Form form) {
        if ( form == null ) {
            return null;
        }

        FormDTO.FormDTOBuilder formDTO = FormDTO.builder();

        formDTO.pacient( pacientToPacientDTO( form.getPacient() ) );
        formDTO.formJson( form.getFormJson() );

        return formDTO.build();
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
}
