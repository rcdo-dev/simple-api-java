package com.rcdo.alunosturma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcdo.alunosturma.domain.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
