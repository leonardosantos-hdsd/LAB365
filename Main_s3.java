package com.semana03;

public class Main_s3 {
    public static void main(String[] args) {
        MatrizAleatoria matrizAleatoria = new MatrizAleatoria();
        matrizAleatoria.preencherMatriz();

        int[][] matriz = matrizAleatoria.getMatriz();
        int somaImpares = MatrizUtils.calcularSomaImpares(matriz);
        int[] somaColunas = MatrizUtils.calcularSomaColunas(matriz);
        int[] somaLinhas = MatrizUtils.calcularSomaLinhas(matriz);

        MatrizUtils.imprimirMatriz(matriz);
        System.out.println("Soma dos números ímpares: " + somaImpares);
        MatrizUtils.imprimirVetor(somaColunas, "colunas");
        MatrizUtils.imprimirVetor(somaLinhas, "linhas");

        // Criação de um array de inteiros para teste
        int[] valores = {10, 20, 30, 40, 50};

        // Instanciar a classe de cálculo
        ArrayCalculator calculadora = new ArrayCalculator();

        // Calcular a soma dos elementos
        int resultado = calculadora.somarElementos(valores);

        // Exibir o resultado
        System.out.println("A soma dos elementos do array é: " + resultado);

    }
}


//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        int[][] matriz = new int[5][5];
//        Random random = new Random();
//        int somaImpares = 0;
//
//        // Preenchendo a matriz com números aleatórios e calculando a soma dos ímpares
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                matriz[i][j] = random.nextInt(100); // Números aleatórios entre 0 e 99
//                if (matriz[i][j] % 2 != 0) {
//                    somaImpares += matriz[i][j];
//                }
//            }
//        }
//
//        // Calculando a soma das colunas
//        int[] somaColunas = new int[5];
//        for (int j = 0; j < 5; j++) {
//            for (int i = 0; i < 5; i++) {
//                somaColunas[j] += matriz[i][j];
//            }
//        }
//
//        // Calculando a soma das linhas
//        int[] somaLinhas = new int[5];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                somaLinhas[i] += matriz[i][j];
//            }
//        }
//
//        // Exibindo os resultados
//        System.out.println("Matriz gerada:");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(matriz[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Soma dos números ímpares: " + somaImpares);
//
//        System.out.println("Soma das colunas:");
//        for (int j = 0; j < 5; j++) {
//            System.out.print(somaColunas[j] + "\t");
//        }
//        System.out.println();
//
//        System.out.println("Soma das linhas:");
//        for (int i = 0; i < 5; i++) {
//            System.out.print(somaLinhas[i] + "\t");
//        }
//    }
//}
//
