package com.senac.pi.portalmatricula.model.enums;

import lombok.Getter;

@Getter
public enum TipoPagamento {

    BOLETO(1, "BOLETO"), PIX(2, "PIX");

    private Integer id;
    private String nome;

    TipoPagamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }


}
