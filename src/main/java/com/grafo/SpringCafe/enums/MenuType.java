package com.grafo.SpringCafe.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public enum MenuType {
    FOOD ("Food"),
    DRINK ("Drink");
    private String desc;
}
