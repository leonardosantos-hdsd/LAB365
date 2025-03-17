package com.semana05.exe03;

public class Voluntario {
    private String nome;
    private String email;

    // Construtor para inicializar o voluntário.
    public Voluntario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Método para associar um voluntário a um projeto sustentável
    public void participarProjeto(ProjetoSustentavel projeto) {
        projeto.adicionarVoluntario(this);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
