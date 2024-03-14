package com.grafo.SpringCafe.dto.request;

import com.grafo.SpringCafe.entities.StaffEntity;
import com.grafo.SpringCafe.enums.Currency;
import lombok.Data;

@Data
public class RequestMenu {
    private String itemName;
    private String description;
    private double price;
    private Currency currency;
    private StaffEntity staffEntity;
}
