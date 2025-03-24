//6. Hacer un programa que sume 5 precios de camisas (en dólares) y que luego muestre el total de la venta en pesos. 

package com.mycompany.precioscamisas;

import java.util.Scanner;

public class Precioscamisas {

    public static void main(String[] args) {
       int[] precios = new int [5];
       int dolar = 3900;
       int totalusd=0, totalcop;
       Scanner enter = new Scanner(System.in);
       
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el valor de la camisa "+(i+1)+" en dolares");
            precios[i] = enter.nextInt();           
        }
        for (int j = 0; j < 5; j++) {
            totalusd=precios[j]+totalusd;
        }
        totalcop=totalusd*dolar;
        System.out.println("El total de la compra en USD es de "+totalusd+" Convertido a pesos es "+totalcop);
    }
}
