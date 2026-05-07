package com.gerenciadorTarefas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
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
