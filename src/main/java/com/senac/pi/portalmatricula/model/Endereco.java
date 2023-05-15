package com.senac.pi.portalmatricula.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "tb_endereco")
public class Endereco {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String endereco;

    private Integer numero;

    private String bairro;

    private String cep;

    private String cidade;

    private String uf;

    @OneToOne(mappedBy = "endereco")
    private Aluno aluno;
}
