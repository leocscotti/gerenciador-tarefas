package com.gerenciadorTarefas.repository;

import com.gerenciadorTarefas.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
