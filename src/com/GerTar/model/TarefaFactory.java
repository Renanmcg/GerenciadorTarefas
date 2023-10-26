package com.GerTar.model;

import java.util.Date; 

public interface TarefaFactory {
    Tarefa criarTarefa(int id, String nome, String descricao, Date dataDeVencimento, int prioridade);
}



