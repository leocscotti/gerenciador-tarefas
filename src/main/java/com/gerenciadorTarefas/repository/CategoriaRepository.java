package com.gerenciadorTarefas.repository;

import com.gerenciadorTarefas.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
