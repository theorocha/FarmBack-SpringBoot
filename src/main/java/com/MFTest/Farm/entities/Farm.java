package com.MFTest.Farm.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
public class Farm implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private int inscricao;

    @JsonIgnore
    @OneToMany(mappedBy = "farm",cascade = CascadeType.ALL)
    List<Pasto> pastos = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "farm", cascade = CascadeType.ALL)
    List<Owner> owners = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "farm",cascade = CascadeType.ALL)
    List<Funcionario> funcionarios = new ArrayList<>();

    public Farm(String nome, int inscricao) {
        this.nome = nome;
        this.inscricao = inscricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }
}
