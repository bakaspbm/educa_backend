package com.backend.educa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract  class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_usuario;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CIDADE cidade;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TIPODEUSER tipo;
    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime dataCriacao;
    @UpdateTimestamp
    private LocalDateTime dataAtualizacao;
    @Column(nullable = false)
    private boolean ativo =  true;

}
