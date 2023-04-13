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
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 200, nullable = false)
    private String nome;
    private int cpf;
    private int rg;
    private String endereco;
    private int celular;



    @OneToMany(mappedBy = "professor")
    List<Agenda> agenda;

    @OneToMany(mappedBy = "professor")
    List<Especializacao> especializacao;

}
