package com.semana05.exe06;

import java.util.List;

public abstract class ProjetoSustentavel implements ImpactoAmbiental {
    private String nome;
    private String descricao;

    // Construtor para inicializar o projeto sustentável.
    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Método abstrato para calcular impacto ambiental (implementado nas subclasses)
    public abstract void calcularImpacto();

    // Método para exibir detalhes do projeto
    public void exibirDetalhes() {
        System.out.println("\n\uD83D\uDCCC Projeto: " + nome);
        System.out.println("  -Descrição: " + descricao);
        calcularImpacto();
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
}
