package com.GerTar.model;

import com.GerTar.repository.TarefaRepository;

import java.util.List; 
import java.util.Date; 

public class GerTarSingleton {

    private static GerTarSingleton instancia = null;
    private TarefaRepository tarefaRepository; 

    private GerTarSingleton() {
        tarefaRepository = new TarefaRepository();
    }

    public static GerTarSingleton getInstance() {
        if (instancia == null) {
            instancia = new GerTarSingleton();
        }
        return instancia;
    }

    // Método para adicionar uma tarefa
    public void adicionarTarefa(int id, String nome, String descricao, Date dataDeVencimento, int prioridade) {
        Tarefa tarefa = new Tarefa(id, nome, descricao, dataDeVencimento, prioridade);
        tarefaRepository.adicionarTarefa(tarefa);
    }

    // Método para listar todas as tarefas
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.listarTarefas();
    }

    // Método para excluir uma tarefa
    public void excluirTarefa(Tarefa tarefa) {
        tarefaRepository.excluirTarefa(tarefa);
    }
    
    // Método para atualizar uma tarefa
    public void atualizarTarefa(int id, String novoNome, String novaDescricao, Date novaDataDeVencimento, int novaPrioridade) {
        // Obter a lista de tarefas
        List<Tarefa> tarefas = tarefaRepository.listarTarefas();
        
        // Iterar sobre a lista para encontrar a tarefa com o ID correspondente
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                // Atualizar os atributos da tarefa
                tarefa.setNome(novoNome);
                tarefa.setDescricao(novaDescricao);
                tarefa.setDataDeVencimento(novaDataDeVencimento);
                tarefa.setPrioridade(novaPrioridade);
                break;
            }
        }
    }
}
