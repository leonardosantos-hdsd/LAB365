package com.semana03;

public class ArrayCalculator {
    public int somarElementos(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }
}
