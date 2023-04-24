package com.senac.pi.portalmatricula.model;

import com.senac.pi.portalmatricula.model.enums.Curso;
import com.senac.pi.portalmatricula.model.enums.TipoPagamento;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

import static com.senac.pi.portalmatricula.model.enums.TipoPagamento.BOLETO;

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
