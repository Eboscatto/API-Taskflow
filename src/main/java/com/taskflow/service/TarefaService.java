package com.taskflow.service;

import com.taskflow.model.Tarefa;
import com.taskflow.repository.TarefaRepository;
import jakarta.persistence.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listar() {
        return repository.findAll();
    }

    public Optional<Tarefa> buscar(Long id) {
        return repository.findById(id);
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
