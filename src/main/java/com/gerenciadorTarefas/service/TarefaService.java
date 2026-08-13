package com.gerenciadorTarefas.service;

import com.gerenciadorTarefas.dto.request.TarefaRequest;
import com.gerenciadorTarefas.dto.response.TarefaResponse;
import com.gerenciadorTarefas.exception.RecursoNaoEncontradoException;
import com.gerenciadorTarefas.mapper.TarefaMapper;
import com.gerenciadorTarefas.models.Categoria;
import com.gerenciadorTarefas.models.Tarefa;
import com.gerenciadorTarefas.models.Usuario;
import com.gerenciadorTarefas.repository.CategoriaRepository;
import com.gerenciadorTarefas.repository.TarefaRepository;
import com.gerenciadorTarefas.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private final TarefaRepository tarefaRepository;
    private final UsuarioRepository usuarioRepository;
    private final CategoriaRepository categoriaRepository;
    private final TarefaMapper mapper;

    public Page<TarefaResponse> listar(Pageable pageable) {
        return tarefaRepository.findAll(pageable)
                .map(mapper::toDTO);
    }

    public TarefaResponse buscarPorId(Long id) {
        Tarefa t = tarefaRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Tarefa não encontrada"));

        return mapper.toDTO(t);
    }

    public TarefaResponse criar(TarefaRequest dto) {

        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RecursoNaoEncontradoException("Usuário não encontrado"));

        Categoria categoria = categoriaRepository.findById(dto.getCategoriaId())
                .orElseThrow(() -> new RecursoNaoEncontradoException("Categoria não encontrada"));

        Tarefa tarefa = mapper.toEntity(dto);
        tarefa.setUsuario(usuario);
        tarefa.setCategoria(categoria);

        return mapper.toDTO(tarefaRepository.save(tarefa));
    }

    public TarefaResponse atualizar(Long id, TarefaRequest dto) {

        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Tarefa não encontrada"));

        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RecursoNaoEncontradoException("Usuário não encontrado"));

        Categoria categoria = categoriaRepository.findById(dto.getCategoriaId())
                .orElseThrow(() -> new RecursoNaoEncontradoException("Categoria não encontrada"));

        tarefa.setTitulo(dto.getTitulo());
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setPrioridade(dto.getPrioridade());
        tarefa.setStatus(dto.getStatus());
        tarefa.setPrazo(dto.getPrazo());
        tarefa.setUsuario(usuario);
        tarefa.setCategoria(categoria);

        return mapper.toDTO(tarefaRepository.save(tarefa));
    }

    public void deletar(Long id) {
        if (!tarefaRepository.existsById(id)) {
            throw new RecursoNaoEncontradoException("Tarefa não encontrada");
        }
        tarefaRepository.deleteById(id);
    }
}
