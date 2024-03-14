package com.grafo.SpringCafe.entities;

import com.grafo.SpringCafe.enums.AccessStatus;
import com.grafo.SpringCafe.enums.Position;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "staff_table")
public class StaffEntity {
    @Id
    @Column(name = "id", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "staff_name", columnDefinition = "VARCHAR(30) DEFAULT ''")
    private String staffName;
    @Column(name = "age", length = 10)
    private int age;
    @Column(name = "email", columnDefinition = "VARCHAR(30) DEFAULT ''")
    private String email;
    @Column( name = "address", columnDefinition="VARCHAR(225) DEFAULT ''")
    private String address;

    @Column(name = "position")
    @Enumerated(EnumType.STRING)
    private Position position;

    @Column(name = "access_status")
    @Enumerated(EnumType.STRING)
    private AccessStatus accessStatus;
}
