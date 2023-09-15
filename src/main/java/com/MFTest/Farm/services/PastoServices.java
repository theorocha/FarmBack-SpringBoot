package com.MFTest.Farm.services;

import com.MFTest.Farm.entities.Gado;
import com.MFTest.Farm.entities.Pasto;
import com.MFTest.Farm.repositories.PastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PastoServices {
    @Autowired
    private PastoRepository pastoRepository;

    public List<Pasto> findAllPastos(){
        return pastoRepository.findAll();
    }

    public Optional<Pasto> findPastoByid(int id){
        return pastoRepository.findById(id);
    }

    public void savePasto(Pasto pasto){
        pastoRepository.save(pasto);
    }

    public Optional<List<Gado>> gadoPorPasto(int pasto_id){
        Optional<Pasto> P =  pastoRepository.findById(pasto_id);
        if(P.isPresent()){
            List<Gado> Gados = P.get().getGados();
            return Optional.of(Gados);
        }else{
            return Optional.empty();
        }
    }

}

