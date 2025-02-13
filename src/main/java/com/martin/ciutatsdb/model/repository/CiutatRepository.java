package com.martin.ciutatsdb.model.repository;

import com.martin.ciutatsdb.model.entity.Ciutats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiutatRepository extends JpaRepository<Ciutats, Integer> {
}
