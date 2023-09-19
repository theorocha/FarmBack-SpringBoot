package com.MFTest.Farm.services;

import com.MFTest.Farm.entities.Farm;

import com.MFTest.Farm.entities.Funcionario;
import com.MFTest.Farm.repositories.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionariosServices {
    @Autowired
     private FuncionariosRepository funcionariosRepository;

    public List<Funcionario> getAll(){
        return funcionariosRepository.findAll();
    }

    public Optional<Funcionario> getFuncionarioByid(int id){
        return funcionariosRepository.findById(id);
    }

    public void saveFuncionario(Funcionario F){
        funcionariosRepository.save(F);
    }

    public void delete(Integer id){
        funcionariosRepository.deleteById(id);
    }

    public Funcionario update(Integer id, Funcionario f){
        Funcionario entity = funcionariosRepository.getReferenceById(id);
        updateData(entity,f);
        return funcionariosRepository.save(entity);
    }

    private void updateData(Funcionario entity, Funcionario f) {
        entity.setNome(f.getNome());
        entity.setDta_nasc(f.getDta_nasc());
    }
}
