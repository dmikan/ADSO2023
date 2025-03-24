//Elaborar un algoritmo que permita ingresar 20 números y muestre todos los números menores e iguales a 25. 

package com.mycompany.numerosmenores;

import java.util.Scanner;

public class Numerosmenores {

    public static void main(String[] args) {
        System.out.println("Ingrese 20 numeros");
        Scanner enter = new Scanner(System.in);
        int[] num = new int[20];
        
        for (int i = 0; i < 20; i++) {
            num[i]=enter.nextInt();
        }
        for (int j = 0; j < 20; j++) {
            if (num[j]<=25) {
                System.out.println("El numero en la posicion "+j+" es "+num[j]+" y es menor que 25");
            }
        }
               
    }
}
