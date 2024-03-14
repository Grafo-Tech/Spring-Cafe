package com.grafo.SpringCafe.dto;

import com.grafo.SpringCafe.enums.ItemType;
import lombok.Data;

import java.util.List;

@Data
public class ChiefDto {
    private long id;
    private String chief_name;
    private ItemType menu_type;
    private String menu_name;
    private boolean disable;
    private List<MenuDto> menuDtoList;
}
