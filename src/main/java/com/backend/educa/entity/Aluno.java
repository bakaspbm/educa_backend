package com.backend.educa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "aluno")
public class Aluno extends Usuario {

    @ManyToOne
    @JoinColumn(name = "instituicao_id", nullable = true)
    private Instituicao instituicao;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;




}
