package com.gerenciadorTarefas.mapper;

import com.gerenciadorTarefas.dto.request.CategoriaRequest;
import com.gerenciadorTarefas.dto.response.CategoriaResponse;
import com.gerenciadorTarefas.models.Categoria;
import org.springframework.stereotype.Component;

@Component
public class CategoriaMapper {

    public Categoria toEntity(CategoriaRequest dto) {
        Categoria c = new Categoria();
        c.setNome(dto.getNome());
        return c;
    }

    public CategoriaResponse toDTO(Categoria c) {
        return new CategoriaResponse(c.getId(), c.getNome());
    }
}
