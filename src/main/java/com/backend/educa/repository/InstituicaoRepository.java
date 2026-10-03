package com.backend.educa.repository;

import com.backend.educa.entity.Instituicao;
import com.backend.educa.entity.TIPOINSTITUICAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface InstituicaoRepository extends JpaRepository<Instituicao, UUID> {

    List<Instituicao> findByNome(String nome);
    List<Instituicao>  findByAprovada(boolean aprovada);
    List<Instituicao> findByTipo(TIPOINSTITUICAO tipo);

}
