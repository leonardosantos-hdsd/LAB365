package com.semana03;

public class Main_s3 {
    public static void main(String[] args) {
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
