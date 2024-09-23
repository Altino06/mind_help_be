package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.AddressDTO;
import com.mindhelp.backend.infradb.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    @Mapping(target = "street", source = "dto.street")
    @Mapping(target = "number", source = "dto.number")
    @Mapping(target = "city", source = "dto.city")
    @Mapping(target = "state", source = "dto.state")
    Address toEntity(AddressDTO dto);


    @Mapping(target = "street", source = "address.street")
    @Mapping(target = "number", source = "address.number")
    @Mapping(target = "city", source = "address.city")
    @Mapping(target = "state", source = "address.state")
    AddressDTO toDTO(Address address);
}
