package com.GerTar.model;

public class PrioridadeNomeStrategy implements PrioridadeStrategy {
    @Override
    public int calcularPrioridade(Tarefa tarefa) {
        String nome = tarefa.getNome();
        int tamanhoDoNome = nome.length();

        // Atribui uma prioridade com base no tamanho do nome da tarefa
        if (tamanhoDoNome <= 5) {
            return 1; // Tarefas com nomes muito curtos têm alta prioridade
        } else if (tamanhoDoNome <= 10) {
            return 2; // Tarefas com nomes de tamanho médio têm prioridade média
        } else {
            return 3; // Tarefas com nomes longos têm baixa prioridade
        }
    }
}
