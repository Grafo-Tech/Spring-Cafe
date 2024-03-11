package com.grafo.SpringCafe.dto.request;

import com.grafo.SpringCafe.enums.MenuType;
import lombok.Data;

@Data
public class RequestChief {
    private String chief_name;
    private MenuType menu_type;
    private String menu_name;
    private boolean disable;
}
