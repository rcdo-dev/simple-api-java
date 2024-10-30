package com.rcdo.alunosturma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcdo.alunosturma.domain.Aluno;
import com.rcdo.alunosturma.repositories.AlunoRepository;

@RestController
@RequestMapping(value = "/users")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public List<Aluno> findAll(){
        List<Aluno> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Aluno findById(@PathVariable Long id){
        Aluno result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Aluno insert(@RequestBody Aluno aluno){
        Aluno result = repository.save(aluno);
        return result;
    }
    
}
