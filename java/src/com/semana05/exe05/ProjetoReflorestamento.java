package com.semana05.exe05;

// Representa um projeto de reflorestamento.
public class ProjetoReflorestamento extends ProjetoSustentavel {
    private int arvoresPlantadas;

    public ProjetoReflorestamento(String nome, String descricao, int arvoresPlantadas) {
        super(nome, descricao);
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public double calcularImpacto() {
        return arvoresPlantadas * 1.5;
    }

    public int getArvoresPlantadas() { return arvoresPlantadas; }
}
