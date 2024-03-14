package com.grafo.SpringCafe.dto;

import com.grafo.SpringCafe.enums.Currency;
import lombok.Data;

@Data
public class MenuDto {
    private long id;
    private String itemName;
    private String description;
    private double price;
    private Currency currency;
}
