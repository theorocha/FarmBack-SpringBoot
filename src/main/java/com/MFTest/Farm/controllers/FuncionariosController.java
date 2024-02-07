package com.MFTest.Farm.controllers;

import com.MFTest.Farm.entities.Funcionario;
import com.MFTest.Farm.services.FuncionariosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("funcionario")
public class FuncionariosController {
    @Autowired
    private FuncionariosServices funcionariosServices;

    @GetMapping
    public List<Funcionario> getAllfuncionarios(){
        return funcionariosServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Funcionario> getfuncionariosByid(@PathVariable int id){
        return funcionariosServices.getFuncionarioByid(id);
    }

    @PostMapping
    public void savefuncionarios(@RequestBody Funcionario funcionario){
        funcionariosServices.saveFuncionario(funcionario);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        funcionariosServices.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Funcionario> update(@PathVariable int id, @RequestBody Funcionario funcionario){
        funcionario = funcionariosServices.update(id,funcionario);
        return ResponseEntity.ok().body(funcionario);
    }
    
}
