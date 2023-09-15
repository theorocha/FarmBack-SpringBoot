package com.MFTest.Farm.controllers;

import com.MFTest.Farm.entities.Owner;
import com.MFTest.Farm.services.OwnerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.MFTest.Farm.repositories.OwnerRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("owners")
public class OwnerController {
    @Autowired
    private OwnerServices ownerService;


    @GetMapping
    public List<Owner> findAll(){
        return ownerService.findAllOwners();
    }
    @GetMapping("/{id}")
    public Optional<Owner> getOwnerById(@PathVariable int id){
        return ownerService.findOwnerById(id);
    }
    @PostMapping
    public void saveOwner(@RequestBody Owner owner){
        ownerService.saveOwner(owner);
    }
}
