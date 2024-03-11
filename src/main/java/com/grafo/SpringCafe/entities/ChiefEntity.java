package com.grafo.SpringCafe.entities;

import com.grafo.SpringCafe.enums.MenuType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chief_table")
public class ChiefEntity {
    @Id
    @Column(name = "chief_id", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long chief_id;
    @Column(name = "chief_name", length = 20)
    private String chief_name;
    @Column(name = "menu_type", length = 20)
    private MenuType menu_type;
    @Column(name = "menu_name", length = 20)
    private String menu_name;
    @Column(name = "disable", length = 20)
    private boolean disable;
}
