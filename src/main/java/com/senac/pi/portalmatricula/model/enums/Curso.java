package com.senac.pi.portalmatricula.model.enums;

import lombok.Getter;

import javax.persistence.Entity;

@Getter
public enum Curso {

    ENGENHARIA(1, "ENGENHARIA"), DADOS(2, "ENGENHARIA DE DADOS");

    private Integer id;
    private String nome;


    Curso(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }


}
