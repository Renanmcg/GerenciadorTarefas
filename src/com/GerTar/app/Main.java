package com.GerTar.app;

import com.GerTar.model.GerTarSingleton;
import com.GerTar.model.Tarefa;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inicialize o GerTarSingleton (ou seja, seu sistema)
        GerTarSingleton sistema = GerTarSingleton.getInstance();

        // Aqui você pode adicionar código para interagir com o sistema, como criar tarefas, listar tarefas, etc.

        // Exemplo de criação de uma tarefa
        sistema.adicionarTarefa(1, "Minha Tarefa", "Esta é uma tarefa de exemplo", new Date(), 2);

        // Exemplo de listagem de tarefas
        List<Tarefa> tarefas = sistema.listarTarefas();
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
