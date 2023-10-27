package com.GerTar.app;

import com.GerTar.model.Tarefa;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TarefaFacade tarefaFacade = new TarefaFacade();

        // Exemplo de criação de tarefa usando o Facade
        tarefaFacade.criarTarefa(2, "Outra Tarefa", "Esta é outra tarefa de exemplo", new Date(), 1);

        // Exemplo de listagem de tarefas usando o Facade
        List<Tarefa> tarefas = tarefaFacade.listarTarefas();
        for (Tarefa tarefa : tarefas) {
            System.out.println("ID: " + tarefa.getId());
            System.out.println("Nome: " + tarefa.getNome());
            System.out.println("Descrição: " + tarefa.getDescricao());
            System.out.println("Data de Vencimento: " + tarefa.getDataDeVencimento());
            System.out.println("Prioridade: " + tarefa.getPrioridade());
            System.out.println();
        }
    }
}
