package com.gerenciadorTarefas.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gerenciadorTarefas.models.Prioridade;
import com.gerenciadorTarefas.models.StatusTarefa;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor

public class TarefaResponse {
    private Long id;
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private StatusTarefa status;
    private LocalDate dataCriacao;
    private LocalDateTime prazo;
    private String nomeUsuario;
    private String nomeCategoria;
}
