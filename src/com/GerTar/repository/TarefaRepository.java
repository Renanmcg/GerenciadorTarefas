package com.GerTar.repository;

import com.GerTar.model.Tarefa;

import java.util.Date; 
import java.util.ArrayList;
import java.util.List;

public class TarefaRepository {

    private List<Tarefa> tarefas;

    public TarefaRepository() {
        this.tarefas = new ArrayList<>();
    }

    // Método para adicionar uma tarefa ao repositório
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    // Método para listar todas as tarefas no repositório
    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    // Método para excluir uma tarefa do repositório
    public void excluirTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    // Método para atualizar o nome de uma tarefa
    public void atualizarNomeTarefa(int idTarefa, String novoNome) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == idTarefa) {
                tarefa.setNome(novoNome);
                break;
            }
        }
    }

    // Método para atualizar a descrição de uma tarefa
    public void atualizarDescricaoTarefa(int idTarefa, String novaDescricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == idTarefa) {
                tarefa.setDescricao(novaDescricao);
                break;
            }
        }
    }

    // Método para atualizar a data de vencimento de uma tarefa
    public void atualizarDataDeVencimentoTarefa(int idTarefa, Date novaDataDeVencimento) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == idTarefa) {
                tarefa.setDataDeVencimento(novaDataDeVencimento);
                break;
            }
        }
    }

    // Método para atualizar a prioridade de uma tarefa
    public void atualizarPrioridadeTarefa(int idTarefa, int novaPrioridade) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == idTarefa) {
                tarefa.setPrioridade(novaPrioridade);
                break;
            }
        }
    }
}    

