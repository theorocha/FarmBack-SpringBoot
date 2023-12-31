package com.MFTest.Farm.services;

import com.MFTest.Farm.entities.Farm;
import com.MFTest.Farm.entities.Farm;
import com.MFTest.Farm.entities.Funcionario;
import com.MFTest.Farm.repositories.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmServices {
    @Autowired
     private FarmRepository farmRepository;

    public List<Farm> getAll(){
        return farmRepository.findAll();
    }

    public Optional<Farm> getFarmByid(int id){
        return farmRepository.findById(id);
    }

    public void saveFarm(Farm Farm){
        farmRepository.save(Farm);
    }

    public void delete(Integer id){
        farmRepository.deleteById(id);
    }

    public Farm update(Integer id, Farm obj){
        Farm entity = farmRepository.getReferenceById(id);
        updateData(entity,obj);
        return farmRepository.save(entity);
    }

    private void updateData(Farm entity, Farm obj) {
        entity.setNome(obj.getNome());
        entity.setInscricao(obj.getInscricao());
    }

    public Optional<List<Funcionario>> getAllFunc(int id) {
        Optional<Farm> F = farmRepository.findById(id);
        if(F.isPresent()){
            List<Funcionario> funcionarioList = F.get().getFuncionarios();
            return Optional.of(funcionarioList);
        }else{
            return Optional.empty();
        }
    }


}
