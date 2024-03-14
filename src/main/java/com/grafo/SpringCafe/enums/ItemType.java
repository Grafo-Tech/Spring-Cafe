package com.grafo.SpringCafe.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ItemType {
    FOOD ("Food"),
    DRINK ("Drink");
    private String desc;
}
