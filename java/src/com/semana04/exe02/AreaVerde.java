package com.semana04.exe02;

public class AreaVerde {
    private String nome;
    private String localizacao;
    private double tamanho; // em hectares
    private String statusConservacao;
    private String responsavel;

    // Construtor
    public AreaVerde(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    // Métodos getters e setters para os novos atributos
    public String getStatusConservacao() {
        return statusConservacao;
    }

    public void setStatusConservacao(String statusConservacao) {
        this.statusConservacao = statusConservacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Área Verde: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Tamanho: " + tamanho + " hectares");
        System.out.println("Status de Conservação: " + statusConservacao);
        System.out.println("Responsável: " + responsavel + "\n");
    }
}
