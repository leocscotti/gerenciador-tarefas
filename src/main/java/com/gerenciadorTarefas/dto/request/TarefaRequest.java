package com.gerenciadorTarefas.dto.request;

import com.gerenciadorTarefas.models.Prioridade;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TarefaRequest {

    @NotBlank
    private String titulo;

    private String descricao;

    @NotNull
    private Prioridade prioridade;

    @NotNull
    private Long usuarioId;

    @NotNull
    private Long categoriaId;
}
