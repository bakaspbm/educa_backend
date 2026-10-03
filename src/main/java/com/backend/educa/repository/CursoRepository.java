package com.backend.educa.repository;

import com.backend.educa.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface  CursoRepository  extends JpaRepository<Curso, Long> {

    List<Curso> findByNome(String nome);
    List<Curso> findByInstituicao(Instituicao instituicao);
    List<Curso> findByCategoria(Categoria categoria);
    List<Curso> findByPropina(BigDecimal propina);
    List<Curso> findByModalidade(MODALIDADE modalidade);
    List<Curso> findByDuracao(int duracao);
    List<Curso> findByGrau(GRAU grau);


}
