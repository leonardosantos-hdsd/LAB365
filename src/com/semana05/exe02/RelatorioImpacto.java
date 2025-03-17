package com.semana05.exe02;

public class RelatorioImpacto {
    private int arvoresPlantadas;
    private double reducaoCO2; // em toneladas

    // Construtor para inicializar o relatório de impacto.
    public RelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.arvoresPlantadas = arvoresPlantadas;
        this.reducaoCO2 = reducaoCO2;
    }

    // Método para exibir os dados do relatório
    public void exibirRelatorio() {
        System.out.println("\uD83D\uDCC4 Relatório de Impacto Ambiental:");
        System.out.println("  -Árvores Plantadas: " + arvoresPlantadas);
        System.out.println("  -Redução de CO2: " + reducaoCO2 + " toneladas");
    }
}
