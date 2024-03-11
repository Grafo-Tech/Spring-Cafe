package com.grafo.SpringCafe.repositories;

import com.grafo.SpringCafe.entities.ChiefEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiefRepo extends JpaRepository<ChiefEntity, Long> {
}
