package com.semana05.exe02;

import java.util.ArrayList;
import java.util.List;

public class ProjetoSustentavel {
    private String nome;
    private String descricao;
    private List<Voluntario> voluntarios;
    private RelatorioImpacto relatorioImpacto;


    // Construtor para inicializar o projeto sustentável.
    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.voluntarios = new ArrayList<>();
    }

    // Método para adicionar voluntários ao projeto
    public void adicionarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
        System.out.println("\uD83D\uDC65 Voluntário '" + voluntario.getNome() + "' adicionado ao projeto '" + nome + "'.");
    }

    // Método para gerar um relatório de impacto ambiental
    public void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.relatorioImpacto = new RelatorioImpacto(arvoresPlantadas, reducaoCO2);
        System.out.println("\uD83D\uDCC4 Relatório de impacto gerado para o projeto '" + nome + "'.");
    }

    // Método para exibir detalhes do projeto
    public void exibirDetalhes() {
        System.out.println("\n\uD83D\uDCCC Projeto: " + nome);
        System.out.println("  -Descrição: " + descricao);
        System.out.println("  -Número de Voluntários: " + voluntarios.size());
        if (relatorioImpacto != null) {
            relatorioImpacto.exibirRelatorio();
        } else {
            System.out.println("  -Nenhum relatório de impacto gerado.");
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
