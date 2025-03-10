package com.semana02;

import java.util.Scanner;

public class SalaryCalculator {
    public void calculateSalary() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor recebido por hora: ");
        double valorPorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("O funcionário %s trabalhou %d horas, e portanto possui R$ %.2f a receber.%n",
                nome, horasTrabalhadas, salario);
    }
}
