package com.semana05.exe04;

import java.util.ArrayList;
import java.util.List;

public class ProjetoSustentavel implements ImpactoAmbiental{
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

    // Método obrigatório da interface para calcular impacto ambiental
    @Override
    public double calcularImpacto() {
        if (relatorioImpacto == null) {
            return 0;
        }
        return (relatorioImpacto.getArvoresPlantadas() * 1.5) + (relatorioImpacto.getReducaoCO2() * 2);
    }

    // Método para exibir detalhes do projeto
    public void exibirDetalhes() {
        System.out.println("\n\uD83D\uDCCC Projeto: " + nome);
        System.out.println("  -Descrição: " + descricao);
        System.out.println("  -Número de Voluntários: " + voluntarios.size());
        if (relatorioImpacto != null) {
            relatorioImpacto.exibirRelatorio();
            System.out.println("  - \uD83C\uDF31 Impacto Ambiental Total: " + calcularImpacto());
        } else {
            System.out.println("  - \uFE0F Nenhum relatório de impacto gerado.");
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
