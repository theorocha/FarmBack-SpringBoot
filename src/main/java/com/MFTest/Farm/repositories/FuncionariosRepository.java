package com.MFTest.Farm.repositories;

import com.MFTest.Farm.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionario,Integer> {
}
