package com.senac.pi.portalmatricula.model.enums;

import lombok.Getter;

@Getter
public enum Curso {

    ENGENHARIA(1, "ENGENHARIA"), DADOS(2, "ENGENHARIA DE DADOS"), ADS(3, "Analise e Desenvolvimento de Sistemas ");

    private Integer id;
    private String nome;


    Curso(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }


}
