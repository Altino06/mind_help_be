package com.mindhelp.backend.domain.mapper;

import com.mindhelp.backend.app.dto.AvaiableConsultDateDTO;
import com.mindhelp.backend.infradb.model.AvaiableConsultDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-23T20:06:35-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.3 (JetBrains s.r.o.)"
)
@Component
public class AvaiableConsulDateMapperImpl implements AvaiableConsulDateMapper {

    @Override
    public AvaiableConsultDate toEntity(AvaiableConsultDateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AvaiableConsultDate.AvaiableConsultDateBuilder avaiableConsultDate = AvaiableConsultDate.builder();

        avaiableConsultDate.avaiableConsultDate( dto.getAvaiableConsultDate() );

        return avaiableConsultDate.build();
    }

    @Override
    public AvaiableConsultDateDTO toDTO(AvaiableConsultDate avaiableConsultDate) {
        if ( avaiableConsultDate == null ) {
            return null;
        }

        AvaiableConsultDateDTO.AvaiableConsultDateDTOBuilder avaiableConsultDateDTO = AvaiableConsultDateDTO.builder();

        avaiableConsultDateDTO.avaiableConsultDate( avaiableConsultDate.getAvaiableConsultDate() );

        return avaiableConsultDateDTO.build();
    }
}
