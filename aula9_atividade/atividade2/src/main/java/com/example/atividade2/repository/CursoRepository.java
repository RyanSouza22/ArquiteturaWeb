package com.example.atividade2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.atividade2.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
