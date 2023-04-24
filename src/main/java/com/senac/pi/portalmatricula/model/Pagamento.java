package com.senac.pi.portalmatricula.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_pagemnto")
abstract class Pagamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Aluno aluno;

    public static Integer gerarCod(){
        int cod = Math.toIntExact(Math.round(Math.random() * 10000000));
        return cod;
    }


}
