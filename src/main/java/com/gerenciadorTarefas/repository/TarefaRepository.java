package com.gerenciadorTarefas.repository;

import com.gerenciadorTarefas.models.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}