package com.example.atividade2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.atividade2.model.Curso;
import com.example.atividade2.repository.CursoRepository;
import com.example.atividade2.repository.ProfessorRepository;

@RestController
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping(value="/systemxyz/curso")    
    public List<Curso> getTodos(){
        return cursoRepository.findAll();
    }

    @PostMapping(value="/systemxyz/curso/inserirnovo")
    public Curso inserirCurso(@RequestBody Curso curso){
        return cursoRepository.save(curso);
    }

    @PutMapping(value="/api/updateusuario/updateusuario")
    public Curso updateCurso(@RequestBody Curso curso){
        return cursoRepository.save(curso);
    }

    @DeleteMapping(value="/api/updateusuario/updateusuario/{id}")
    public void deleteUsuario(@PathVariable("id") long id){
        cursoRepository.delete(cursoRepository.findById(id));
    }
}
