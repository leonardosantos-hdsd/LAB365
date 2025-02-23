package com.semana02;

import java.util.Scanner;

public class SumCalculator {
    public int sumValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        return A + B;
    }
}
