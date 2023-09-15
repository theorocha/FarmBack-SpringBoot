package com.MFTest.Farm.services;

import com.MFTest.Farm.entities.Farm;
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
}
