package com.GerTar.model;

import java.util.Date;

public class TarefaPessoalFactory implements TarefaFactory {
    public Tarefa criarTarefa(int id, String nome, String descricao, Date dataDeVencimento, int prioridade) {
        return new TarefaPessoal(id, nome, descricao, dataDeVencimento, prioridade);
    }
}
