package com.senac.pi.portalmatricula.model;

import com.senac.pi.portalmatricula.model.enums.Curso;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Curso curso;

    private String cpf;

    private String matrícula;

    public Aluno(String nome, Curso curso, String cpf, String matrícula) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
        this.matrícula = matrícula;
    }

    public Aluno() {
    }
}
