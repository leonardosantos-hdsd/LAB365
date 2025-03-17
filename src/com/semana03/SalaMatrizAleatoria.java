package com.semana03;

import java.util.Random;

public class SalaMatrizAleatoria {
    private int[][] matriz;
    private Random random;

    public SalaMatrizAleatoria() {
        matriz = new int[5][5];
        random = new Random();
    }

    public void preencherMatriz() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatórios entre 0 e 99
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }
}
