package com.patlanf.domain.atendimento;

import com.patlanf.domain.cadastro.Animal;
import com.patlanf.domain.cadastro.Cadastro;
import com.patlanf.domain.cadastro.ProdutoServico;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {
    private Integer id;
    private AtendimentoTipo tipo;
    private AtendimentoStatus status;
    private String descricao;
    private LocalDate data;
    private LocalTime hora;
    private Cadastro solicitante;
    private ProdutoServico servico;
    private Animal paciente;
}
