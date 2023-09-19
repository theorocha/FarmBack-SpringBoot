package com.MFTest.Farm.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@Getter
@Entity
@NoArgsConstructor
@EqualsAndHashCode

public class Pasto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "farm_id")
    private Farm farm;

    @JsonIgnore
    @OneToMany(mappedBy = "pasto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Gado> gados = new ArrayList<>();


    public Pasto(String nome, Farm farm) {
        this.nome = nome;
        this.farm = farm;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}
