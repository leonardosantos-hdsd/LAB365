package com.semana04.exe01;

public class AreaVerde {
    private String nome;
    private String localizacao;
    private double tamanho;

    // Construtor
    public AreaVerde(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Área Verde: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Tamanho: " + tamanho + " hectares\n");
    }
}
