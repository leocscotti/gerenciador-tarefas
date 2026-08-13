package com.gerenciadorTarefas.mapper;

import com.gerenciadorTarefas.dto.request.TarefaRequest;
import com.gerenciadorTarefas.dto.response.TarefaResponse;
import com.gerenciadorTarefas.models.Tarefa;
import org.springframework.stereotype.Component;

@Component
public class TarefaMapper {

    public Tarefa toEntity(TarefaRequest dto) {
        Tarefa t = new Tarefa();
        t.setTitulo(dto.getTitulo());
        t.setDescricao(dto.getDescricao());
        t.setPrioridade(dto.getPrioridade());
        t.setStatus(dto.getStatus());
        t.setPrazo(dto.getPrazo());
        return t;
    }

    public TarefaResponse toDTO(Tarefa t) {
        return new TarefaResponse(
                t.getId(),
                t.getTitulo(),
                t.getDescricao(),
                t.getPrioridade(),
                t.getStatus(),
                t.getDataCriacao(),
                t.getPrazo(),
                t.getUsuario().getNome(),
                t.getCategoria().getNome()
        );
    }
}
