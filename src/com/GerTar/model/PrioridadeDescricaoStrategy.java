package com.GerTar.model;

public class PrioridadeDescricaoStrategy implements PrioridadeStrategy {

    @Override
    public int calcularPrioridade(Tarefa tarefa) {
        // Lógica para calcular a prioridade com base na descrição da tarefa
        String descricao = tarefa.getDescricao();
        int prioridade = 0;

        if (descricao != null) {
            prioridade = descricao.length(); // Quanto mais longa a descrição, maior a prioridade
        }

        return prioridade;
    }
}
