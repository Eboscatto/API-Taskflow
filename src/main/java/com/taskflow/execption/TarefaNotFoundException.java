package com.taskflow.execption;

public class TarefaNotFoundException extends RuntimeException{
    public TarefaNotFoundException(Long id) {
        super("Tarefa com id " + id + " não encontrada");
    }
}
