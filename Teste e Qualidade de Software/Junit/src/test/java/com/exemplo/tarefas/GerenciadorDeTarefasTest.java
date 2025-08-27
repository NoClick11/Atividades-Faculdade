package com.exemplo.tarefas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GerenciadorDeTarefasTest {

    private GerenciadorDeTarefas gerenciador;

    @BeforeEach
    void setUp() { gerenciador = new GerenciadorDeTarefas(); }

    @Test
    void deveAdicionarUmaTarefa() {
        gerenciador.adicionarTarefa("Estudar JUnit");
        assertTrue(gerenciador.verificarTarefa("Estudar JUnit"));
    }

    @Test
    void deveRemoverUmaTarefaExistente() {
        gerenciador.adicionarTarefa("Fazer exercícios");
        boolean removida = gerenciador.removerTarefa("Fazer exercícios");
        assertTrue(removida);
        assertFalse(gerenciador.verificarTarefa("Fazer exercícios"));
    }

    @Test
    void naoDeveRemoverUmaTarefaInexistente() {
        boolean removida = gerenciador.removerTarefa("Tarefa Fantasma");
        assertFalse(removida);
    }

    @Test
    void deveListarTodasAsTarefas() {
        gerenciador.adicionarTarefa("Tarefa 1");
        gerenciador.adicionarTarefa("Tarefa 2");
        gerenciador.adicionarTarefa("Tarefa 3");
        List<String> tarefas = gerenciador.listarTarefas();
        assertEquals(3, tarefas.size());
        assertTrue(tarefas.contains("Tarefa 1"));
        assertTrue(tarefas.contains("Tarefa 2"));
        assertTrue(tarefas.contains("Tarefa 3"));
    }

    @Test
    void deveVerificarSeUmaTarefaExiste() {
        gerenciador.adicionarTarefa("Estudar Spring Boot");
        assertTrue(gerenciador.verificarTarefa("Estudar Spring Boot"));
        assertFalse(gerenciador.verificarTarefa("Estudar Hibernate"));
    }
}
