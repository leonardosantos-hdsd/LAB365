package com.semana02;

import java.util.Scanner;

public class CircleCalculator {
    private static final double PI = 3.14159;

    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        return PI * raio * raio;
    }
}
