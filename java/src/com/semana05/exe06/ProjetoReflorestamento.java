package com.semana05.exe06;

// Representa um projeto de reflorestamento.
public class ProjetoReflorestamento extends ProjetoSustentavel {
    private int arvoresPlantadas;

    public ProjetoReflorestamento(String nome, String descricao, int arvoresPlantadas) {
        super(nome, descricao);
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public void calcularImpacto() {
        System.out.println("\uD83C\uDF31 Impacto: " + arvoresPlantadas + " árvores plantadas.");
    }

    public int getArvoresPlantadas() { return arvoresPlantadas; }
}
