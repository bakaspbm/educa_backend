package com.backend.educa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
@Setter
@Getter
@ToString
@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long curso_id;
    private String nome;
    private String descricao;
    @ManyToOne
   @JoinColumn(name = "instituicao_id", nullable = true)
    private Instituicao instituicao;
    private String saidas_do_curso;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categoria categoria;
    private int cargaHoraria;
    @Enumerated(EnumType.STRING)
    private MODALIDADE modalidade;
    private BigDecimal propina;
    private int vagas;
    private int duracao;
    private GRAU grau;

}
