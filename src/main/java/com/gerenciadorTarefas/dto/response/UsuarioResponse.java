package com.gerenciadorTarefas.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class UsuarioResponse {

    private Long id;
    private String nome;
    private String email;
}
