package com.semana04.exe04;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe AreaVerde com o novo construtor
        AreaVerde parque = new AreaVerde("Parque Zoobotânico", "Rua Pastor Schlösser, Joinville", 250_000);
        AreaVerde bosque = new AreaVerde("Bosque do Expedicionário", "Centro, Joinville", 105_000);

        // Definindo status de conservação e responsáveis
        parque.setStatusConservacao("Bem Conservado");
        parque.setResponsavel("Prefeitura de Joinville");

        bosque.setStatusConservacao("Necessita Manutenção");
        bosque.setResponsavel("Secretaria de Meio Ambiente");

        // Criando objetos da classe MonitoramentoResiduos com o novo construtor
        MonitoramentoResiduos coleta1 = new MonitoramentoResiduos("Plástico", 120.0, LocalDate.of(2024, 3, 1));
        MonitoramentoResiduos coleta2 = new MonitoramentoResiduos("Orgânico", 230.5, LocalDate.of(2024, 3, 2));

        // Definindo status e responsáveis pela coleta
        coleta1.setStatusColeta("Coleta Concluída");
        coleta1.setResponsavelColeta("Empresa Recicla+");

        coleta2.setStatusColeta("Pendente");
        coleta2.setResponsavelColeta("Serviço Municipal de Limpeza");

        // Exibindo informações dos objetos criados
        System.out.println("=== Áreas Verdes Monitoradas ===");
        parque.exibirInformacoes();
        bosque.exibirInformacoes();

        System.out.println("=== Registros de Monitoramento de Resíduos ===");
        coleta1.exibirInformacoes();
        coleta2.exibirInformacoes();
    }
}

