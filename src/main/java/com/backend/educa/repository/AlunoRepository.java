package com.backend.educa.repository;

import com.backend.educa.entity.Aluno;
import com.backend.educa.entity.Categoria;
import com.backend.educa.entity.Curso;
import com.backend.educa.entity.Instituicao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AlunoRepository  extends JpaRepository<Aluno, UUID> {


    List<Aluno> findByNome(String nome);

    List<Aluno> findByCurso(Curso curso);

    List<Aluno> findByInstituicao(Instituicao instituicao);
}
