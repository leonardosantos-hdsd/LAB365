package com.semana05.exe05;

// Representa uma Empresa que gerencia projetos sustentáveis.
public class Empresa extends Organizacao {
    private String cnpj;

    public Empresa(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() { return cnpj; }
}
