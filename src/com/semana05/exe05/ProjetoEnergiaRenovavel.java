package com.semana05.exe05;

// Representa um projeto de energia renovável.
public class ProjetoEnergiaRenovavel extends ProjetoSustentavel {
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome, String descricao, double energiaGerada) {
        super(nome, descricao);
        this.energiaGerada = energiaGerada;
    }

    @Override
    public double calcularImpacto() {
        return energiaGerada * 3.0;
    }

    public double getEnergiaGerada() { return energiaGerada; }
}
