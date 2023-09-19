package com.MFTest.Farm.controllers;

import com.MFTest.Farm.entities.Gado;
import com.MFTest.Farm.entities.Gado;
import com.MFTest.Farm.services.GadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("gado")
public class GadoController {
    @Autowired
    private GadoServices gadoServices;
    @GetMapping
    public List<Gado> getAllGado(){
        return gadoServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Gado> getGadoByid(@PathVariable int id){
        return gadoServices.getGadoByid(id);
    }

    @PostMapping
    public void saveGado(@RequestBody Gado gado){
        gadoServices.saveGado(gado);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        gadoServices.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Gado> update(@PathVariable int id, @RequestBody Gado obj){
        obj = gadoServices.update(id,obj);
        return ResponseEntity.ok().body(obj);
    }



}
