package com.semana04.exe01;

import java.time.LocalDate;

public class MonitoramentoResiduos {
    private String tipoResiduo;
    private double quantidade;
    private LocalDate dataColeta;

    // Construtor
    public MonitoramentoResiduos(String tipoResiduo, double quantidade, LocalDate dataColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Tipo de Resíduo: " + tipoResiduo);
        System.out.println("Quantidade: " + quantidade + " kg");
        System.out.println("Data da Coleta: " + dataColeta + "\n");
    }
}
