package com.MFTest.Farm.controllers;

import com.MFTest.Farm.entities.Funcionario;
import com.MFTest.Farm.services.FuncionariosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("funcionarios")
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
    
}
