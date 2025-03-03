package com.semana03;

public class S3_Main {
    public static void main(String[] args) {

        // Criação de um array de inteiros para teste
        int[] valores = {10, 20, 30, 40, 50};

        // Instanciar a classe de cálculo
        S3_ArrayCalculator calculadora = new S3_ArrayCalculator();

        // Calcular a soma dos elementos
        int resultado = calculadora.somarElementos(valores);

        // Exibir o resultado
        System.out.println("A soma dos elementos do array é: " + resultado);

    }
}
