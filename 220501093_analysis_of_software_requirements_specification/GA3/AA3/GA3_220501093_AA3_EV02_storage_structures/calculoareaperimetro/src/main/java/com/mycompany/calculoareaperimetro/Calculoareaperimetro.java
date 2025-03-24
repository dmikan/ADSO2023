package com.mycompany.calculoareaperimetro;

import java.util.Scanner;

public class Calculoareaperimetro {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura para calcular el área y el perímetro:");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Círculo");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                calcularTriangulo(scanner);
                break;
            case 2:
                calcularRectangulo(scanner);
                break;
            case 3:
                calcularCuadrado(scanner);
                break;
            case 4:
                calcularCirculo(scanner);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        System.out.print("Ingrese el lado 1 del triángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el lado 2 del triángulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el lado 3 del triángulo: ");
        double lado3 = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = lado1 + lado2 + lado3;

        System.out.println("Área del triángulo: " + area);
        System.out.println("Perímetro del triángulo: " + perimetro);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
        
        
        
    }
}
