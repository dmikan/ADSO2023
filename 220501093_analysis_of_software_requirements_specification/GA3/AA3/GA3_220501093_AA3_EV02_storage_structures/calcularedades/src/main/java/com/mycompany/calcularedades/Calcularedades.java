package com.mycompany.calcularedades;

import java.util.Scanner;

public class Calcularedades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[10]; 

       
        for (int i = 0; i < edades.length; i++) {
            boolean edadValida = false;
            while (!edadValida) {
                System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
                int edad = scanner.nextInt();

                if (edad >= 1 && edad <= 120) {
                    edades[i] = edad;
                    edadValida = true;
                } else {
                    System.out.println("Edad no válida. Debe estar entre 1 y 120 años. Intente nuevamente.");
                }
            }
        }

    
        int menoresDeEdad = 0;
        int mayoresDeEdad = 0;
        int adultosMayores = 0;
        int edadMinima = edades[0];
        int edadMaxima = edades[0];
        int sumaEdades = 0;

        for (int edad : edades) {
           
            if (edad < 18) {
                menoresDeEdad++;
            }
           
            if (edad >= 18) {
                mayoresDeEdad++;
            }
          
            if (edad >= 60) {
                adultosMayores++;
            }
         
            if (edad < edadMinima) {
                edadMinima = edad;
            }
          
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
            
            sumaEdades += edad;
        }

      
        double promedioEdades = (double) sumaEdades / edades.length;
        System.out.println("\nResultados:");
        System.out.println("Cantidad de personas menores de edad: " + menoresDeEdad);
        System.out.println("Cantidad de personas mayores de edad: " + mayoresDeEdad);
        System.out.println("Cantidad de adultos mayores (60+ años): " + adultosMayores);
        System.out.println("Edad más baja: " + edadMinima);
        System.out.println("Edad más alta: " + edadMaxima);
        System.out.println("Promedio de edades: " + promedioEdades);

        scanner.close();
    }
}