package com.semana05.exe05;

public class AppGestaoProjetos {
    public static void main(String[] args) {
//        // Criando uma organização
//        Organizacao ong = new Organizacao("Verde Esperança");
//
//        // Criando projetos sustentáveis
//        ProjetoSustentavel projeto1 = new ProjetoSustentavel("Reflorestamento Urbano", "Plantar árvores em áreas degradadas.");
//        ProjetoSustentavel projeto2 = new ProjetoSustentavel("Reciclagem Comunitária", "Coleta e reciclagem de resíduos sólidos.");
//
//        // Adicionando projetos à organização
//        ong.adicionarProjeto(projeto1);
//        ong.adicionarProjeto(projeto2);
//
//        // Criando voluntários
//        Voluntario voluntario1 = new Voluntario("Ana Souza", "ana@email.com");
//        Voluntario voluntario2 = new Voluntario("Carlos Lima", "carlos@email.com");
//
//        // Associando voluntários a projetos
//        voluntario1.participarProjeto(projeto1);
//        voluntario2.participarProjeto(projeto2);
//
//        // Gerando relatórios de impacto
//        projeto1.gerarRelatorioImpacto(500, 2.5);
//        projeto2.gerarRelatorioImpacto(0, 1.8);
//
//        // Exibindo informações
//        ong.listarProjetos();
//        projeto1.exibirDetalhes();
//        projeto2.exibirDetalhes();

        // Criando uma ONG
        ONG ong = new ONG("Verde Esperança");

        // Criando uma Empresa
        Empresa empresa = new Empresa("Eco Energia", "12.345.678/0001-99");

        // Criando projetos sustentáveis
        ProjetoSustentavel projeto1 = new ProjetoReflorestamento("Reflorestamento Urbano", "Plantar árvores em áreas degradadas.", 500);
        ProjetoSustentavel projeto2 = new ProjetoReciclagem("Reciclagem Comunitária", "Coleta e reciclagem de resíduos sólidos.", 20.5);
        ProjetoSustentavel projeto3 = new ProjetoEnergiaRenovavel("Usina Solar", "Geração de energia limpa com placas solares.", 1500);

        // Adicionando projetos às organizações
        ong.adicionarProjeto(projeto1);
        empresa.adicionarProjeto(projeto2);
        empresa.adicionarProjeto(projeto3);

        // Exibindo projetos cadastrados
        ong.listarProjetos();
        empresa.listarProjetos();

        // Exibindo detalhes de cada projeto
        projeto1.exibirDetalhes();
        projeto2.exibirDetalhes();
        projeto3.exibirDetalhes();
    }
}
