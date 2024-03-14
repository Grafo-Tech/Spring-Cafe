package com.grafo.SpringCafe.dto.request;

import com.grafo.SpringCafe.dto.MenuDto;
import com.grafo.SpringCafe.enums.ItemType;
import lombok.Data;

import java.util.List;

@Data
public class RequestChief {
    private String chief_name;
    private ItemType menu_type;
    private String menu_name;
    private boolean disable;
    private List<MenuDto> menuDtoList;
}
