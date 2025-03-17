package com.semana04.exe06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppSustentabilidade {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<AreaVerde> listaAreasVerdes = new ArrayList<>();
    private static final List<MonitoramentoResiduos> listaResiduos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== Aplicativo de Sustentabilidade ===");
            System.out.println("1. Cadastrar nova área verde");
            System.out.println("2. Cadastrar monitoramento de resíduos");
            System.out.println("3. Exibir todas as áreas verdes");
            System.out.println("4. Exibir todos os monitoramentos de resíduos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAreaVerde();
                case 2 -> cadastrarMonitoramentoResiduos();
                case 3 -> exibirAreasVerdes();
                case 4 -> exibirMonitoramentosResiduos();
                case 5 -> System.out.println("Saindo... Obrigado por utilizar o App Sustentabilidade!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static void cadastrarAreaVerde() {
        System.out.print("Nome da área verde: ");
        String nome = scanner.nextLine();

        System.out.print("Localização: ");
        String localizacao = scanner.nextLine();

        System.out.print("Tamanho (m²): ");
        double tamanho = scanner.nextDouble();
        scanner.nextLine();

        AreaVerde novaArea = new AreaVerde(nome, localizacao, tamanho);

        System.out.print("Status de conservação: ");
        novaArea.setStatusConservacao(scanner.nextLine());

        System.out.print("Responsável pela área: ");
        novaArea.setResponsavel(scanner.nextLine());

        listaAreasVerdes.add(novaArea);
        System.out.println("✅ Área verde cadastrada com sucesso!\n");
    }

    private static void cadastrarMonitoramentoResiduos() {
        System.out.print("Tipo de resíduo: ");
        String tipoResiduo = scanner.nextLine();

        System.out.print("Quantidade coletada (kg): ");
        double quantidade = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Data da coleta (AAAA-MM-DD): ");
        String dataStr = scanner.nextLine();
        LocalDate dataColeta = LocalDate.parse(dataStr);

        MonitoramentoResiduos novoMonitoramento = new MonitoramentoResiduos(tipoResiduo, quantidade, dataColeta);

        System.out.print("Status da coleta: ");
        novoMonitoramento.setStatusColeta(scanner.nextLine());

        System.out.print("Responsável pela coleta: ");
        novoMonitoramento.setResponsavelColeta(scanner.nextLine());

        listaResiduos.add(novoMonitoramento);
        System.out.println("✅ Monitoramento de resíduos cadastrado com sucesso!\n");
    }

    private static void exibirAreasVerdes() {
        if (listaAreasVerdes.isEmpty()) {
            System.out.println("⚠️ Nenhuma área verde cadastrada.\n");
            return;
        }
        System.out.println("\n=== Áreas Verdes Cadastradas ===");
        for (AreaVerde area : listaAreasVerdes) {
            area.exibirInformacoes();
        }
    }

    private static void exibirMonitoramentosResiduos() {
        if (listaResiduos.isEmpty()) {
            System.out.println("⚠️ Nenhum monitoramento de resíduos cadastrado.\n");
            return;
        }
        System.out.println("\n=== Monitoramentos de Resíduos Cadastrados ===");
        for (MonitoramentoResiduos monitoramento : listaResiduos) {
            monitoramento.exibirInformacoes();
        }
    }
}
