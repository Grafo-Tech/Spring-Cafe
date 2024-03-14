package com.grafo.SpringCafe.service;

import com.grafo.SpringCafe.dto.ChiefDto;
import com.grafo.SpringCafe.dto.MenuDto;
import com.grafo.SpringCafe.dto.global.DataBody;
import com.grafo.SpringCafe.dto.request.RequestChief;
import com.grafo.SpringCafe.dto.request.RequestMenu;

import java.util.List;

public interface MenuService {
    DataBody<MenuDto> createMenu (RequestMenu requestMenu);
    DataBody<List<MenuDto>> getAllMenu ();
}
