package com.martin.ciutatsdb.model.repository;

import com.martin.ciutatsdb.model.entity.Paisos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Paisos, Integer> {
}
