package com.gerenciadorTarefas.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    private Boolean concluida = false;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Categoria categoria;
}
