package com.grafo.SpringCafe.service.serviceImpl;

import com.grafo.SpringCafe.dto.MenuDto;
import com.grafo.SpringCafe.dto.global.DataBody;
import com.grafo.SpringCafe.dto.request.RequestMenu;
import com.grafo.SpringCafe.entities.MenuEntity;
import com.grafo.SpringCafe.mapper.MenuMapper;
import com.grafo.SpringCafe.repositories.MenuRepo;
import com.grafo.SpringCafe.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuRepo menuRepo;
    private final MenuMapper menuMapper;
    @Override
    public DataBody<MenuDto> createMenu(RequestMenu requestMenu) {
        MenuEntity menu = this.menuMapper.requestDtoToEntity(requestMenu);
        this.menuRepo.save(menu);
        MenuDto menuDto = this.menuMapper.entityToDto(menu);
        return new DataBody<>(menuDto);
    }
    @Override
    public DataBody<List<MenuDto>> getAllMenu() {
        List<MenuEntity> menuEntityList = this.menuRepo.findAll();
        List<MenuDto> menuDtoList = this.menuMapper.entityListToDtoList(menuEntityList);
        return new DataBody<>(menuDtoList);
    }
}
