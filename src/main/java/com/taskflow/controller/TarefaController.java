package com.taskflow.controller;

import com.taskflow.model.Tarefa;
import com.taskflow.service.TarefaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
@CrossOrigin(origins = "http://localhost:5173") // Porta 3000 libera o acesso do React
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarefa> listar(){
        return service.listar();
    }
    @PostMapping
    public Tarefa criar(@RequestBody @Valid Tarefa tarefa) {
        return service.salvar(tarefa);
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @RequestBody @Valid Tarefa tarefa) {
        tarefa.setId(id);
        return service.salvar(tarefa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }


}
