package com.semana05.exe04;

import java.util.ArrayList;
import java.util.List;

public class Organizacao {
    private String nome;
    private List<ProjetoSustentavel> listaProjetos;

    // Construtor para inicializar a organização.
    public Organizacao(String nome) {
        this.nome = nome;
        this.listaProjetos = new ArrayList<>();
    }

    // Método para adicionar um projeto sustentável à organização
    public void adicionarProjeto(ProjetoSustentavel projeto) {
        listaProjetos.add(projeto);
        System.out.println("\uD83D\uDCCC Projeto '" + projeto.getNome() + "' adicionado à organização '" + nome + "'.");
    }

    // Método para listar os projetos da organização
    public void listarProjetos() {
        System.out.println("\n=== \uD83D\uDCCC Projetos da Organização: " + nome + " ===");
        if (listaProjetos.isEmpty()) {
            System.out.println("  - \uFE0F Nenhum projeto cadastrado.");
        } else {
            for (ProjetoSustentavel projeto : listaProjetos) {
                System.out.println("  - \uD83C\uDF31 " + projeto.getNome() + ": " + projeto.getDescricao());
            }
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<ProjetoSustentavel> getListaProjetos() { return listaProjetos; }
}
