package com.GerTar.model;

//import com.GerTar.model.TarefaFactory;
//import com.GerTar.model.TarefaTrabalho;
import java.util.Date;

public class TarefaTrabalhoFactory implements TarefaFactory {
    public TarefaTrabalho criarTarefa(int id, String nome, String descricao, Date dataDeVencimento, int prioridade) {
        return new TarefaTrabalho(id, nome, descricao, dataDeVencimento, prioridade);
    }
}
