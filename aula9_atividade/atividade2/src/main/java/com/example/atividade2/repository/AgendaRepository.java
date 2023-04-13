package com.example.atividade2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.atividade2.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{
    
}
