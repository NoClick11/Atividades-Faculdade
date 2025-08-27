package com.exemplo.tarefas;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    private final List<String> tarefas = new ArrayList<>();

    public void adicionarTarefa(String tarefa) {
        if (tarefa != null && !tarefa.isBlank()) {
            tarefas.add(tarefa);
        }
    }

    public boolean removerTarefa(String tarefa) {
        return tarefas.remove(tarefa);
    }

    public List<String> listarTarefas() {
        return (tarefas);
    }

    public boolean verificarTarefa(String tarefa) {
        return tarefas.contains(tarefa);
    }
}
