package com.semana02;

import java.util.Scanner;

public class AverageCalculator {
    public double calculateAverage() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite a nota B: ");
        double B = scanner.nextDouble();

        double average = (A * 3.5 + B * 7.5) / 11;

        return average;
    }
}
