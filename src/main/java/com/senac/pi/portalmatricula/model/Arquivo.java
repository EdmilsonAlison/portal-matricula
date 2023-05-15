package com.senac.pi.portalmatricula.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Arquivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String tipo;

    private Integer alunoId;

    @Lob
    private byte[] conteudo;

    // getters e setters
}

