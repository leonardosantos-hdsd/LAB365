package com.semana03;

import java.util.Random;

public class MatrixService {

    private static final Random RANDOM = new Random();

    public int[][] gerarMatrizAleatoria(int linhas, int colunas, int limiteSuperior) {
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                // Gera valores entre 0 (inclusive) e limiteSuperior (exclusivo)
                matriz[i][j] = RANDOM.nextInt(limiteSuperior);
            }
        }

        return matriz;
    }

    public int encontrarMaiorValor(int[][] matriz) {
        int maior = Integer.MIN_VALUE;

        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor > maior) {
                    maior = valor;
                }
            }
        }

        return maior;
    }
}
