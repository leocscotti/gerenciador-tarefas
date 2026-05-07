package com.gerenciadorTarefas.mapper;

import com.gerenciadorTarefas.dto.request.UsuarioRequest;
import com.gerenciadorTarefas.dto.response.UsuarioResponse;
import com.gerenciadorTarefas.models.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public Usuario toEntity(UsuarioRequest dto) {
        Usuario u = new Usuario();
        u.setNome(dto.getNome());
        u.setEmail(dto.getEmail());
        return u;
    }

    public UsuarioResponse toDTO(Usuario u) {
        return new UsuarioResponse(u.getId(), u.getNome(), u.getEmail());
    }
}
