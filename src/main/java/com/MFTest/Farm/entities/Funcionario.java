package com.MFTest.Farm.entities;

import com.MFTest.Farm.enums.SexoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private SexoEnum sexoEnum;

    @Column(unique = true)
    private int cpf;

    private LocalDate dta_nasc;

    @ManyToOne
    @JoinColumn(name = "fazenda_id")
    private Farm farm;

    public Funcionario(String nome, SexoEnum sexoEnum, int cpf, LocalDate dta_nasc, Farm farm) {
        this.nome = nome;
        this.sexoEnum = sexoEnum;
        this.cpf = cpf;
        this.dta_nasc = dta_nasc;
        this.farm = farm;
    }
}
