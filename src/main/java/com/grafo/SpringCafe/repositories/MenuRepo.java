package com.grafo.SpringCafe.repositories;

import com.grafo.SpringCafe.entities.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository<MenuEntity, Long> {
}
