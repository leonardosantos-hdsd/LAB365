package com.semana03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criação de um array de inteiros para teste
        int[] valores = {10, 20, 30, 40, 50};

        // Instanciar a classe de cálculo
        ArrayCalculator calculadora = new ArrayCalculator();

        // Calcular a soma dos elementos
        int resultado = calculadora.somarElementos(valores);

        // Exibir o resultado
        System.out.println("A soma dos elementos do array é: " + resultado);

        // Criação de um array de caracteres para teste
        char[] letras = {'J', 'a', 'v', 'a', '0', '3'};

        // Instancia a classe de manipulação
        CharArrayManipulator manipulador = new CharArrayManipulator();

        // Exibe o array original
        System.out.print("Array original: ");
        System.out.println(letras);

        // Inverte o array
        manipulador.inverterArray(letras);

        // Exibe o array invertido
        System.out.print("Array invertido: ");
        System.out.println(letras);

        // Instanciamos a classe de serviço
        MatrixService matrixService = new MatrixService();

        // Gera uma matriz 3x3 com valores aleatórios entre 0 e 100
        int[][] matriz = matrixService.gerarMatrizAleatoria(3, 3, 100);

        // Imprime a matriz gerada
        System.out.println("Matriz Gerada (3x3):");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        // Encontra o maior valor na matriz
        int maiorValor = matrixService.encontrarMaiorValor(matriz);

        // Exibe o maior valor encontrado
        System.out.println("\nO maior valor na matriz é: " + maiorValor);

        // Instanciando a classe de serviço
        DoubleArrayService arrayService = new DoubleArrayService();

        // Criação de um array de números reais (double) para teste
        double[] numeros = { 10.5, 20.2, 30.8, 40.0 };

        // Cálculo da média
        double media = arrayService.calculaMedia(numeros);

        // Impressão do resultado
        System.out.println("A média dos valores do array é: " + media);

        // Instancia a classe de serviço de retorno
        StringFilterService filterService = new StringFilterService();

        // Cria uma lista de Strings para teste
        List<String> palavras = new ArrayList<>();
        palavras.add("Java");
        palavras.add("Javascript");
        palavras.add("Python");
        palavras.add("Julia");
        palavras.add("C");
        palavras.add("Cobol");

        // Define o caractere de filtragem
        char filtro = 'J';

        // Chama a função de filtragem
        List<String> retorno = filterService.filtrarPorCaractere(palavras, filtro);

        // Exibe os resultados
        System.out.println("Lista original: " + palavras);
        System.out.println("Strings que começam com '" + filtro + "': " + retorno);
    }
}
