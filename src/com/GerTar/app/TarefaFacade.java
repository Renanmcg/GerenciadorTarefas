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

    public void criarTarefa(int id, String nome, String descricao, Date dataDeVencimento, int prioridade) {
        sistema.adicionarTarefa(id, nome, descricao, dataDeVencimento, prioridade);
    }

    public List<Tarefa> listarTarefas() {
        return sistema.listarTarefas();
    }

    public void atualizarTarefa(int id, String novoNome, String novaDescricao, Date novaDataDeVencimento, int novaPrioridade) {
        sistema.atualizarTarefa(id, novoNome, novaDescricao, novaDataDeVencimento, novaPrioridade);
    }

    public void excluirTarefa(Tarefa tarefa) {
        sistema.excluirTarefa(tarefa);
    }
}
