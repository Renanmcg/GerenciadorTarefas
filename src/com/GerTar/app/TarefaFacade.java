package com.GerTar.app;

import com.GerTar.model.GerTarSingleton;
import com.GerTar.model.Tarefa;
import java.util.Date;
import java.util.List;

public class TarefaFacade {
    private GerTarSingleton sistema;

    public TarefaFacade() {
        sistema = GerTarSingleton.getInstance();
    }

    // Cria uma nova tarefa no sistema
    public void criarTarefa(int id, String nome, String descricao, Date dataDeVencimento, int prioridade) {
        sistema.adicionarTarefa(id, nome, descricao, dataDeVencimento, prioridade);
    }

    // Lista todas as tarefas existentes no sistema
    public List<Tarefa> listarTarefas() {
        return sistema.listarTarefas();
    }

    // Atualiza os detalhes de uma tarefa existente
    public void atualizarTarefa(int id, String novoNome, String novaDescricao, Date novaDataDeVencimento, int novaPrioridade) {
        sistema.atualizarTarefa(id, novoNome, novaDescricao, novaDataDeVencimento, novaPrioridade);
    }

    // Remove uma tarefa do sistema
    public void excluirTarefa(Tarefa tarefa) {
        sistema.excluirTarefa(tarefa);
    }
}

