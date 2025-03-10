package com.semana04.exe03;

public class AreaVerde {
    private String nome;
    private String localizacao;
    private double tamanho; // em metros quadrados
    private String statusConservacao;
    private String responsavel;

    // Construtor
    public AreaVerde(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho; // Tamanho em metros quadrados
    }

    // Métodos getters e setters para os atributos adicionais
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

    public double calcularTamanhoEmHectares() {
        return tamanho / 10_000; // 1 hectare = 10.000 m²
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Área Verde: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Tamanho: " + calcularTamanhoEmHectares() + " hectares");
        System.out.println("Status de Conservação: " + statusConservacao);
        System.out.println("Responsável: " + responsavel + "\n");
    }
}

