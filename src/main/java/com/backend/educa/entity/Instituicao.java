package com.backend.educa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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
    private TIPOINSTIITUICAO tipoinstiituicao;


}

