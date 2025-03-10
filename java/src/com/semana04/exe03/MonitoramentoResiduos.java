package com.semana04.exe03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

    // Métodos getters e setters para os atributos adicionais
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

    public double calcularResiduosPorMes() {
        // Calcula quantos dias passaram desde a coleta
        long diasDesdeColeta = ChronoUnit.DAYS.between(dataColeta, LocalDate.now());

        // Se a coleta foi recente (menos de um mês), estimamos o volume mensal
        if (diasDesdeColeta > 0) {
            return (quantidade / diasDesdeColeta) * 30;
        }
        return quantidade; // Se a coleta for de hoje, assumimos que essa é a média mensal
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Tipo de Resíduo: " + tipoResiduo);
        System.out.println("Quantidade: " + quantidade + " kg");
        System.out.println("Data da Coleta: " + dataColeta);
        System.out.println("Status da Coleta: " + statusColeta);
        System.out.println("Responsável pela Coleta: " + responsavelColeta);
        System.out.println("Estimativa de Resíduos por Mês: " + calcularResiduosPorMes() + " kg\n");
    }
}

