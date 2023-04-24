package com.senac.pi.portalmatricula.model.enums;

import lombok.Getter;

import javax.persistence.Entity;

@Getter
public enum Curso {

    ENGENHARIA(1, "ENGENHARIA"), DADOS(2, "ENGENHARIA DE DADOS");


    Curso(int id, String nome) {

    }


}
