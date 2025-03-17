package com.semana04.exe06;

public class AreaVerde {
    private String nome;
    private String localizacao;
    private double tamanho; // em metros quadrados
    private String statusConservacao;
    private String responsavel;

    public AreaVerde(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    // Métodos getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public double getTamanho() { return tamanho; }
    public void setTamanho(double tamanho) { this.tamanho = tamanho; }

    public String getStatusConservacao() { return statusConservacao; }
    public void setStatusConservacao(String statusConservacao) { this.statusConservacao = statusConservacao; }

    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }

    public double calcularTamanhoEmHectares() {
        return tamanho / 10_000; // 1 hectare = 10.000 m²
    }

    public void exibirInformacoes() {
        System.out.println("Área Verde: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Tamanho: " + calcularTamanhoEmHectares() + " hectares");
        System.out.println("Status de Conservação: " + statusConservacao);
        System.out.println("Responsável: " + responsavel + "\n");
    }
}
