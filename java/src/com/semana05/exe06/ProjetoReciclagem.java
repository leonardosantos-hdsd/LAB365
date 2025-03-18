package com.semana05.exe06;

/**
 * Representa um projeto de reciclagem.
 */
public class ProjetoReciclagem extends ProjetoSustentavel {
    private double toneladasRecicladas;

    public ProjetoReciclagem(String nome, String descricao, double toneladasRecicladas) {
        super(nome, descricao);
        this.toneladasRecicladas = toneladasRecicladas;
    }

    @Override
    public void calcularImpacto() {
        System.out.println("\uD83D\uDD04 Impacto: " + toneladasRecicladas + " toneladas de resíduos reciclados.");
    }

    public double getToneladasRecicladas() { return toneladasRecicladas; }
}
