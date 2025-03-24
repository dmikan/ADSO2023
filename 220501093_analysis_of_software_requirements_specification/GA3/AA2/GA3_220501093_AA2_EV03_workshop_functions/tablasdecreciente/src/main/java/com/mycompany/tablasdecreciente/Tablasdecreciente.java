package com.tuempresa;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el capital inicial C:");
        double capitalInicial = scanner.nextDouble();

        System.out.println("Ingrese la tasa de interés anual R (en porcentaje, por ejemplo, 5 para 5%):");
        double tasaInteres = scanner.nextDouble() / 100; // Convertir a decimal

        double años = calcularAñosParaDoblar(capitalInicial, tasaInteres);
        System.out.printf("El capital inicial se doblará en %.2f años.%n", años);

        scanner.close();
    }

    public static double calcularAñosParaDoblar(double capital, double tasaInteres) {
        return Math.log(2) / Math.log(1 + tasaInteres);
    }
}
}

