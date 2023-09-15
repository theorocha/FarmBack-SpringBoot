package com.MFTest.Farm.services;

import com.MFTest.Farm.entities.Gado;
import com.MFTest.Farm.repositories.GadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GadoServices {
    @Autowired
     private GadoRepository gadoRepository;

    public List<Gado> getAll(){
        return gadoRepository.findAll();
    }

    public Optional<Gado> getGadoByid(int id){
        return gadoRepository.findById(id);
    }

    public void saveGado(Gado gado){
        gadoRepository.save(gado);
    }
}
