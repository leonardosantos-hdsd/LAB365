package com.semana02;

//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Hello world! Arquivo Main");
//    }
//}

public class Main {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printMessage();

        SumCalculator sumCalculator = new SumCalculator();
        int soma = sumCalculator.sumValues();
        System.out.println("SOMA = " + soma);

        CircleCalculator circleCalculator = new CircleCalculator();
        double area = circleCalculator.calculateArea();
        System.out.println("Área = " + area);

        ProductCalculator productCalculator = new ProductCalculator();
        int produto = productCalculator.calculateProduct();
        System.out.println("PRODUTO = " + produto);

        AverageCalculator averageCalculator = new AverageCalculator();
        double media = averageCalculator.calculateAverage();
        System.out.printf("MEDIA = %.2f%n", media);
    }
}

