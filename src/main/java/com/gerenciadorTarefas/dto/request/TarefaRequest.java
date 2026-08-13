package com.gerenciadorTarefas.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gerenciadorTarefas.models.Prioridade;
import com.gerenciadorTarefas.models.StatusTarefa;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalDateTime;

@Data

public class TarefaRequest {

    @NotBlank
    private String titulo;

    private String descricao;

    @NotNull
    private Prioridade prioridade;

    @NotNull
    private StatusTarefa status;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime prazo;

    @NotNull
    private Long usuarioId;

    @NotNull
    private Long categoriaId;


}
