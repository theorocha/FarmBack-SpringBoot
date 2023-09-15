package com.MFTest.Farm.repositories;

import com.MFTest.Farm.entities.Pasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PastoRepository extends JpaRepository<Pasto, Integer> {
}
