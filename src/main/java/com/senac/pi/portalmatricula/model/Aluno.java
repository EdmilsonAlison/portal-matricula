package com.senac.pi.portalmatricula.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.senac.pi.portalmatricula.model.enums.Curso;
import com.senac.pi.portalmatricula.model.enums.TipoPagamento;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    private String sobreNome;

    private String cpf;

    private String rg;


    private String telefone;

    private String email;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataNascimento;

    private String nacionalidade;

    @OneToOne
    private Endereco endereco;

    private String matrícula;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Enumerated(EnumType.ORDINAL)
    private TipoPagamento pagamento;


    private Integer codPagamento;

    public Aluno(String nome, Curso curso, String cpf, String matrícula, TipoPagamento pagamento) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
        this.matrícula = matrícula;
        this.pagamento = pagamento;
    }

    public Aluno() {
    }


}
