package com.semana04.exe05;

import java.time.LocalDate;

public class MonitoramentoResiduos {
    private String tipoResiduo;
    private double quantidade; // em kg
    private LocalDate dataColeta;
    private String statusColeta;
    private String responsavelColeta;

    public MonitoramentoResiduos(String tipoResiduo, double quantidade, LocalDate dataColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
    }

    // Métodos getters e setters
    public String getTipoResiduo() { return tipoResiduo; }
    public void setTipoResiduo(String tipoResiduo) { this.tipoResiduo = tipoResiduo; }

    public double getQuantidade() { return quantidade; }
    public void setQuantidade(double quantidade) { this.quantidade = quantidade; }

    public LocalDate getDataColeta() { return dataColeta; }
    public void setDataColeta(LocalDate dataColeta) { this.dataColeta = dataColeta; }

    public String getStatusColeta() { return statusColeta; }
    public void setStatusColeta(String statusColeta) { this.statusColeta = statusColeta; }

    public String getResponsavelColeta() { return responsavelColeta; }
    public void setResponsavelColeta(String responsavelColeta) { this.responsavelColeta = responsavelColeta; }

    public double calcularResiduosPorMes() {
        return quantidade * 30; // Considerando coleta diária
    }

    public void exibirInformacoes() {
        System.out.println("Tipo de Resíduo: " + tipoResiduo);
        System.out.println("Quantidade: " + quantidade + " kg");
        System.out.println("Data da Coleta: " + dataColeta);
        System.out.println("Status da Coleta: " + statusColeta);
        System.out.println("Responsável pela Coleta: " + responsavelColeta);
        System.out.println("Estimativa de Resíduos por Mês: " + calcularResiduosPorMes() + " kg\n");
    }
}
