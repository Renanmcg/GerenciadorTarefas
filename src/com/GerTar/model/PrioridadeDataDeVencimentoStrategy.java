package com.GerTar.model;

import java.util.Date;

public class PrioridadeDataDeVencimentoStrategy implements PrioridadeStrategy {

    @Override
    public int calcularPrioridade(Tarefa tarefa) {
        // Lógica para calcular a prioridade com base na data de vencimento da tarefa

        Date dataAtual = new Date(); // Obtém a data atual
        Date dataVencimento = tarefa.getDataDeVencimento();

        long diferencaMilissegundos = dataVencimento.getTime() - dataAtual.getTime();
        long diferencaDias = diferencaMilissegundos / (1000 * 60 * 60 * 24); // Converte milissegundos para dias

        // A lógica de prioridade pode ser ajustada com base nos valores de diferençaDias
        if (diferencaDias <= 0) {
            return 1; // A tarefa está atrasada, alta prioridade
        } else if (diferencaDias <= 7) {
            return 2; // A tarefa vence em uma semana, prioridade média
        } else {
            return 3; // A tarefa vence em mais de uma semana, baixa prioridade
        }
    }
}
