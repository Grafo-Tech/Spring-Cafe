package com.grafo.SpringCafe.dto;

import com.grafo.SpringCafe.enums.MenuType;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ChiefDto {
    private long chief_id;
    private String chief_name;
    private MenuType menu_type;
    private String menu_name;
    private boolean disable;
}
