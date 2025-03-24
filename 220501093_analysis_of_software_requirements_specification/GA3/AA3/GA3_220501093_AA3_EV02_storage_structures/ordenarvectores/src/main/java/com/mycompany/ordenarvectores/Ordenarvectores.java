package com.mycompany.ordenarvectores;

import java.util.Scanner;

public class Ordenarvectores {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        int[] vector1 = new int[5]; 
        int[] vector2 = new int[5]; 

       
        System.out.println("Ingrese los 5 números del primer vector (orden ascendente):");
        ingresarVector(vector1, scanner);

       
        System.out.println("Ingrese los 5 números del segundo vector (orden ascendente):");
        ingresarVector(vector2, scanner);

       
        int[] resultado = mezclarVectores(vector1, vector2);

      
        System.out.println("Lista ordenada de la mezcla de los dos vectores:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }

   
    private static void ingresarVector(int[] vector, Scanner scanner) {
        for (int i = 0; i < vector.length; i++) {
            boolean valorValido = false;
            while (!valorValido) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                int valor = scanner.nextInt();

                
                if (i == 0 || valor >= vector[i - 1]) {
                    vector[i] = valor;
                    valorValido = true;
                } else {
                    System.out.println("Error: El valor debe ser mayor o igual al anterior.");
                }
            }
        }
    }

  
    private static int[] mezclarVectores(int[] vector1, int[] vector2) {
        int[] resultado = new int[vector1.length + vector2.length];
        int i = 0, j = 0, k = 0;

      
        while (i < vector1.length && j < vector2.length) {
            if (vector1[i] < vector2[j]) {
                resultado[k++] = vector1[i++];
            } else {
                resultado[k++] = vector2[j++];
            }
        }

        
        while (i < vector1.length) {
            resultado[k++] = vector1[i++];
        }

 
        while (j < vector2.length) {
            resultado[k++] = vector2[j++];
        }

        return resultado; 
        
    }
}
