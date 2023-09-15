package com.MFTest.Farm.repositories;

import com.MFTest.Farm.entities.Gado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GadoRepository extends JpaRepository<Gado, Integer> {
}
