package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.AddressDTO;
import com.mindhelp.backend.infradb.model.Address;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-23T19:52:27-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.3 (JetBrains s.r.o.)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address toEntity(AddressDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Address.AddressBuilder address = Address.builder();

        address.street( dto.getStreet() );
        address.number( dto.getNumber() );
        address.city( dto.getCity() );
        address.state( dto.getState() );

        return address.build();
    }

    @Override
    public AddressDTO toDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO.AddressDTOBuilder<?, ?> addressDTO = AddressDTO.builder();

        addressDTO.street( address.getStreet() );
        addressDTO.number( address.getNumber() );
        addressDTO.city( address.getCity() );
        addressDTO.state( address.getState() );

        return addressDTO.build();
    }
}
