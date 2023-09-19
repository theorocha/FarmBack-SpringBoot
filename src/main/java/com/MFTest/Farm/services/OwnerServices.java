package com.MFTest.Farm.services;

import com.MFTest.Farm.entities.Owner;
import com.MFTest.Farm.entities.Owner;
import com.MFTest.Farm.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServices {
    @Autowired
    private OwnerRepository ownerRepository;

    public List<Owner> findAllOwners() {
        return ownerRepository.findAll();
    }
    public Optional<Owner> findOwnerById(int id) {
        return ownerRepository.findById(id);
    }
    public void saveOwner(Owner owner) {
        ownerRepository.save(owner);
    }
    public void delete(Integer id){
        ownerRepository.deleteById(id);
    }

    public Owner update(Integer id, Owner obj){
        Owner entity = ownerRepository.getReferenceById(id);
        updateData(entity,obj);
        return ownerRepository.save(entity);
    }

    private void updateData(Owner entity, Owner obj) {
        entity.setNome(obj.getNome());
    }


}
