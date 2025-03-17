package com.semana04.exe02;

import java.time.LocalDate;

public class MonitoramentoResiduos {
    private String tipoResiduo;
    private double quantidade; // em kg
    private LocalDate dataColeta;
    private String statusColeta;
    private String responsavelColeta;

    // Construtor
    public MonitoramentoResiduos(String tipoResiduo, double quantidade, LocalDate dataColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
    }

    // Métodos getters e setters para os novos atributos
    public String getStatusColeta() {
        return statusColeta;
    }

    public void setStatusColeta(String statusColeta) {
        this.statusColeta = statusColeta;
    }

    public String getResponsavelColeta() {
        return responsavelColeta;
    }

    public void setResponsavelColeta(String responsavelColeta) {
        this.responsavelColeta = responsavelColeta;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Tipo de Resíduo: " + tipoResiduo);
        System.out.println("Quantidade: " + quantidade + " kg");
        System.out.println("Data da Coleta: " + dataColeta);
        System.out.println("Status da Coleta: " + statusColeta);
        System.out.println("Responsável pela Coleta: " + responsavelColeta + "\n");
    }
}
