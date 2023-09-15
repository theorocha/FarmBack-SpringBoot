package com.MFTest.Farm.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Owner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "farm_id")
    private Farm farm;

    public Owner(String nome){
        this.nome = nome;
    }
}
