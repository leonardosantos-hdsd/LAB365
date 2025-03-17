package com.semana03;

public class SalaMatrizUtils {
    public static int calcularSomaImpares(int[][] matriz) {
        int somaImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }
        return somaImpares;
    }

    public static int[] calcularSomaColunas(int[][] matriz) {
        int[] somaColunas = new int[5];
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }
        return somaColunas;
    }

    public static int[] calcularSomaLinhas(int[][] matriz) {
        int[] somaLinhas = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaLinhas[i] += matriz[i][j];
            }
        }
        return somaLinhas;
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz gerada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void imprimirVetor(int[] vetor, String nome) {
        System.out.println("Soma das " + nome + ":");
        for (int i : vetor) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
