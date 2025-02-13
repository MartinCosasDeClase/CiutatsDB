package com.martin.ciutatsdb.model.repository;

import com.martin.ciutatsdb.model.entity.Franquicia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranquiciaRepository extends JpaRepository<Franquicia, Integer> {
}
