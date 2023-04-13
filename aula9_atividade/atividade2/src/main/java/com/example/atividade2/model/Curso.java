package com.example.atividade2.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
     
    @Column(length = 200, nullable = false)
    private String nome;

    @Column(length = 500, nullable = false)
    private String descricao;

    private int cargaHoraria;
    private String objetivo;
    private String ementa;

    @OneToMany(mappedBy = "curso")
    List<Agenda> agenda;

    @OneToMany(mappedBy = "curso")
    List<Especializacao> especializacao;
}
