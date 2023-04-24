package com.senac.pi.portalmatricula.model.dto;

import com.senac.pi.portalmatricula.model.enums.Curso;
import com.senac.pi.portalmatricula.model.enums.TipoPagamento;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
public class AlunoDto {

    private Integer id;
    private String nome;
    private Curso curso;

    private String cpf;

    private String matrícula;
    private TipoPagamento pagamento;

    private Integer codPagamento;
}
