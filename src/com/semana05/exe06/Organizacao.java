package com.semana05.exe06;

import java.util.ArrayList;
import java.util.List;

// Representa uma organização que gerencia projetos sustentáveis.
public abstract class Organizacao {
    private String nome;
    private List<ProjetoSustentavel> listaProjetos;

    public Organizacao(String nome) {
        this.nome = nome;
        this.listaProjetos = new ArrayList<>();
    }

    public void adicionarProjeto(ProjetoSustentavel projeto) {
        listaProjetos.add(projeto);
        System.out.println("\uD83D\uDCCC Projeto '" + projeto.getNome() + "' adicionado à organização '" + nome + "'.");
    }

    public void listarProjetos() {
        System.out.println("\n=== \uD83D\uDCCC Projetos da Organização: " + nome + " ===");
        if (listaProjetos.isEmpty()) {
            System.out.println("\uFE0F Nenhum projeto cadastrado.");
        } else {
            for (ProjetoSustentavel projeto : listaProjetos) {
                System.out.println("- \uD83C\uDF31 " + projeto.getNome() + ": " + projeto.getDescricao());
            }
        }
    }

    public String getNome() { return nome; }
    public List<ProjetoSustentavel> getListaProjetos() { return listaProjetos; }
}
