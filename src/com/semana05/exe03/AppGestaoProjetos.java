package com.semana05.exe03;

public class AppGestaoProjetos {
    public static void main(String[] args) {
        // Criando uma organização
        Organizacao ong = new Organizacao("Verde Esperança");

        // Criando projetos sustentáveis
        ProjetoSustentavel projeto1 = new ProjetoSustentavel("Reflorestamento Urbano", "Plantar árvores em áreas degradadas.");
        ProjetoSustentavel projeto2 = new ProjetoSustentavel("Reciclagem Comunitária", "Coleta e reciclagem de resíduos sólidos.");

        // Adicionando projetos à organização
        ong.adicionarProjeto(projeto1);
        ong.adicionarProjeto(projeto2);

        // Criando voluntários
        Voluntario voluntario1 = new Voluntario("Ana Souza", "ana@email.com");
        Voluntario voluntario2 = new Voluntario("Carlos Lima", "carlos@email.com");

        // Associando voluntários a projetos
        voluntario1.participarProjeto(projeto1);
        voluntario2.participarProjeto(projeto2);

        // Gerando relatórios de impacto
        projeto1.gerarRelatorioImpacto(500, 2.5);
        projeto2.gerarRelatorioImpacto(0, 1.8);

        // Exibindo informações
        ong.listarProjetos();
        projeto1.exibirDetalhes();
        projeto2.exibirDetalhes();
    }
}
