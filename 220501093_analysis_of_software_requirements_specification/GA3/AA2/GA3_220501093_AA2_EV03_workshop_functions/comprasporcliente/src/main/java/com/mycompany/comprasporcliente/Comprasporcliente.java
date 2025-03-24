/** 7. Hacer un programa que registre el consumo realizado por los clientes de un restaurante, 
si el consumo de cada cliente excede 50000 se hará un descuento del 20%. Se debe mostrar el pago de 
cada cliente y el total de todos los pagos. 

valor de pago porcada usuario
y consolidado total de facturas**/


package com.mycompany.comprasporcliente;


import java.util.Scanner;


public class Comprasporcliente {

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        boolean navegador;
        System.out.println("para ingresar una factura digite 1");
        System.out.println("Ingrese 0 para totalizar");
        navegador = lector.hasNextBoolean();
        //int contador=1;
        double [] precio= new double[3];
        double cierre=0;
        
        do {
            for (int i = 1; i < 3+1; i++) {
                System.out.println("Ingrese el valor de la factura del cliente "+i);
                precio[i]=lector.nextDouble();
                if (precio[i]>49900) {
                    precio[i]=precio[i]*0.20;
                }
                cierre=precio[i]+precio[i];
                //contador=contador+1;
            }
            System.out.println("Ingrese 1 para ingresar otra factura");
            System.out.println("Ingrese 0 para ingresar totalizar");
            navegador=lector.hasNextBoolean();
        } while (navegador=true);
        System.out.println("*************VENTAS*************");
        for (int j = 1; j < 3+1; j++) {
            System.out.println("El pago total del cliente "+j+"es: "+precio[j]);
        }
        System.out.println("*************TOTAL VENTAS*************");
        System.out.println("$"+cierre);
    }
}
