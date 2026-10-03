package com.backend.educa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "instituicao")
public class Instituicao  extends Usuario{


    private String descricao;
    private boolean aprovada = false;
    @Enumerated(EnumType.STRING)
    private TIPOINSTITUICAO tipo;


}

