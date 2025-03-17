package com.semana05.exe06;

// Representa um projeto de energia renovável.
public class ProjetoEnergiaRenovavel extends ProjetoSustentavel {
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome, String descricao, double energiaGerada) {
        super(nome, descricao);
        this.energiaGerada = energiaGerada;
    }

    @Override
    public void calcularImpacto() {
        System.out.println("\u26A1 Impacto: " + energiaGerada + " MWh de energia renovável gerada.");
    }

    public double getEnergiaGerada() { return energiaGerada; }
}
