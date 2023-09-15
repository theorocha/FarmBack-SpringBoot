package com.MFTest.Farm.controllers;

import com.MFTest.Farm.entities.Farm;
import com.MFTest.Farm.entities.Gado;
import com.MFTest.Farm.services.FarmServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("farm")
public class FarmController {

    @Autowired
    private FarmServices farmServices;

    @GetMapping
    public List<Farm> getAllFarm(){
        return farmServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Farm> getFarmByid(@PathVariable int id){
        return farmServices.getFarmByid(id);
    }

    @PostMapping
    public void saveFarm(@RequestBody Farm farm){
        farmServices.saveFarm(farm);
    }
}
