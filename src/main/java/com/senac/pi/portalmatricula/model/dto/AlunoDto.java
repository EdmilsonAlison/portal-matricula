package com.senac.pi.portalmatricula.model.dto;

import com.senac.pi.portalmatricula.model.enums.Curso;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoDto {

    private Integer id;
    private String nome;
    private Curso curso;

    private String cpf;

    private String matrícula;
}
