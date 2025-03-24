/*Un corredor de maratón (distancia 42,195 Km) ha recorrido la carrera en 2 horas 25 minutos. 
Se desea un algoritmo que calcule el tiempo medio en minutos por kilómetro. 
*/

package com.mycompany.tiempomaraton;

import java.util.Scanner;

public class Tiempomaraton {

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        String Nombre;
        double distancia;
        int tiempoh, tiempom, tiempo;
        double promedio;
        double total;
        long calculo_1;
        
        System.out.println("Ingrese el nombre del atleta");
        Nombre=lector.nextLine();
        
        System.out.println("Ingrese cuantas HORAS gasto en completar el recorrido");
        tiempoh=lector.nextInt();
        
        System.out.println("Ingrese cuantas MINUTOS gasto en completar el recorrido");
        tiempom=lector.nextInt();
        
        
        distancia = 42.195;
        tiempo = (tiempoh*60)+tiempom;
        
        promedio = tiempo/distancia;
        
        String cad = promedio + "";
        
        String decimal = cad.substring(cad.indexOf(".") + 1);
        String entero = cad.substring(0,cad.indexOf("."));
        
        long factor=Long.parseLong(decimal);
        
        calculo_1=factor*60;
        
        String cad_2 = calculo_1 + "";
        
        String segundos = cad_2.substring(0,2);
        
        System.out.println("El tiempo promedio del corredor "+Nombre+" es de "+entero+":"+segundos+" Min/Km");
        
    }
}
