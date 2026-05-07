package com.gerenciadorTarefas.dto.response;

import com.gerenciadorTarefas.models.Prioridade;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class TarefaResponse {
    private Long id;
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private Boolean concluida;
    private String nomeUsuario;
    private String nomeCategoria;
}
