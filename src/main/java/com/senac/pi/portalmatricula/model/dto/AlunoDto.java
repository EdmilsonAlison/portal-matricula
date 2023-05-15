package com.senac.pi.portalmatricula.model.dto;

import com.senac.pi.portalmatricula.model.enums.Curso;
import com.senac.pi.portalmatricula.model.enums.TipoPagamento;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AlunoDto {

    private Integer id;
    @NonNull 
    private String nome;
    @NotNull
    private Curso curso;
    @NotNull @CPF
    private String cpf;
    @NotNull
    private String matrícula;
    @NotNull
    private TipoPagamento pagamento;
    private Integer codPagamento;
}
