package com.MFTest.Farm.entities;

import com.MFTest.Farm.enums.SexoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Gado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int peso;

    private String raca;

    @Enumerated(EnumType.STRING)
    private SexoEnum sexoEnum;

    @ManyToOne
    @JoinColumn(name = "pasto_id")
    private Pasto pasto;

    public Gado(int peso, String raca, SexoEnum sexoEnum, Pasto pasto) {
        this.peso = peso;
        this.raca = raca;
        this.sexoEnum = sexoEnum;
        this.pasto = pasto;
    }
}
