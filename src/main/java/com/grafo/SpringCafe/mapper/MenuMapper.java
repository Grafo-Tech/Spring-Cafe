package com.grafo.SpringCafe.mapper;

import com.grafo.SpringCafe.dto.MenuDto;
import com.grafo.SpringCafe.dto.request.RequestMenu;
import com.grafo.SpringCafe.entities.MenuEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MenuMapper {
    MenuEntity requestDtoToEntity (RequestMenu requestMenu);
    MenuDto entityToDto (MenuEntity menuEntity);
    List<MenuDto> entityListToDtoList (List<MenuEntity> menuEntityList);
}
