package com.MFTest.Farm.controllers;

import com.MFTest.Farm.entities.Gado;
import com.MFTest.Farm.entities.Pasto;
import com.MFTest.Farm.services.PastoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.MFTest.Farm.repositories.PastoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pastos")
public class PastoController {

    @Autowired
    private PastoServices pastoServices;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Pasto>getAll() {
        return pastoServices.findAllPastos();
    }

    @GetMapping("/{id}")
    public Optional<Pasto> getPastoById(@PathVariable int id){
        return pastoServices.findPastoByid(id);
    }
    @PostMapping
    public void savePasto(@RequestBody Pasto p){
        pastoServices.savePasto(p);
    }

    @GetMapping("/{pasto_id}/gados")
    public Optional<List<Gado>> getGadoByPasto(@PathVariable int pasto_id){
        return pastoServices.gadoPorPasto(pasto_id);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        pastoServices.delete(id);
        return ResponseEntity.noContent().build();
    }

}
