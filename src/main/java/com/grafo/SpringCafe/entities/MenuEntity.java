package com.grafo.SpringCafe.entities;

import com.grafo.SpringCafe.enums.Currency;
import com.grafo.SpringCafe.enums.ItemType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "menu_table")
public class MenuEntity {
    @Id
    @Column(name = "id", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "item_type")
    @Enumerated(EnumType.STRING)
    private ItemType itemType;
    @Column(name = "item_name", columnDefinition = "VARCHAR(50) DEFAULT ''")
    private String itemName;
    @Column(name = "description", columnDefinition = "VARCHAR(225) DEFAULT ''")
    private String description;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "currency")
    @Enumerated(EnumType.STRING)
    private Currency currency;
    @Column(name = "disable", columnDefinition = "tinyint(1) default 1")
    private boolean disable;

}
