package com.GerTar.model;

import java.util.Date;

public class Tarefa {

    private int id; 
    private String nome;
    private String descricao;
    private Date dataDeVencimento;
    private int prioridade;

    public Tarefa(int id, String nome, String descricao, Date dataDeVencimento, int prioridade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataDeVencimento = dataDeVencimento;
        this.prioridade = prioridade;
    }

    // Getters e Setters para os atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters e Setters para os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    // Métodos para atualizar os atributos da tarefa

    public void atualizarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void atualizarDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    public void atualizarDataDeVencimento(Date novaDataDeVencimento) {
        this.dataDeVencimento = novaDataDeVencimento;
    }

    public void atualizarPrioridade(int novaPrioridade) {
        this.prioridade = novaPrioridade;
    }
}
