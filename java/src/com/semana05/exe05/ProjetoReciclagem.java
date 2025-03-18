package com.semana05.exe05;

// Representa um projeto de reciclagem.
public class ProjetoReciclagem extends ProjetoSustentavel {
    private double toneladasRecicladas;

    public ProjetoReciclagem(String nome, String descricao, double toneladasRecicladas) {
        super(nome, descricao);
        this.toneladasRecicladas = toneladasRecicladas;
    }

    @Override
    public double calcularImpacto() {
        return toneladasRecicladas * 2.0;
    }

    public double getToneladasRecicladas() { return toneladasRecicladas; }
}
