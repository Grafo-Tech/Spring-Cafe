package com.grafo.SpringCafe.mapper;

import com.grafo.SpringCafe.dto.ChiefDto;
import com.grafo.SpringCafe.dto.request.RequestChief;
import com.grafo.SpringCafe.entities.ChiefEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ChiefMapper {
    ChiefEntity requestDtoToEntity (RequestChief requestChief);
    ChiefDto entityToDto (ChiefEntity chiefEntity);
    List<ChiefDto> entityListToDtoList (List<ChiefEntity> chiefEntityList);
}
