package com.semana03;
public class DoubleArrayService {
    public double calculaMedia(double[] valores) {
        if (valores == null || valores.length == 0) {
            return 0;
        }
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }
}