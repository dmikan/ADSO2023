//9. Dado N, escribir el producto desde 1 hasta N. 

package com.mycompany.escribirnnumeros;

import java.util.Scanner;

public class EscribirNnumeros {
 
    public static void main(String[] args) {
        System.out.println("ingrese cuantos numeros desea imprimir");
        int n;
        Scanner enter = new Scanner(System.in);
        n=enter.nextInt();
        
        int[] nume= new int[n];
        
        for (int i = 1; i < n+1; i++) {
            System.out.println(i);
        }
    }
}
