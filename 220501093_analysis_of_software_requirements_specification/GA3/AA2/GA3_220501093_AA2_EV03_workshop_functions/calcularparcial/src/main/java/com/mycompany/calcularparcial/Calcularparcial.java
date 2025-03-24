package com.mycompany.calcularparcial;

import java.util.Scanner;

public class Calcularparcial {

    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        
        String nombre;
        float notaa, notab, notac, notad;
        float promedioa, promediob, total;
        
        System.out.println("Ingrese el nombre del estudiante");
        nombre=lector.nextLine();
        
        System.out.println("Ingrese la nota del TALLER 1a USE LA COMA ,");
        notaa=lector.nextFloat();
        System.out.println("Ingrese la nota del TALLER 2 USE LA COMA ,");
        notab=lector.nextFloat();
        System.out.println("Ingrese la nota del QUIZ USE LA COMA ,");
        notac=lector.nextFloat();
        
        System.out.println("Ingrese la nota del PARCIAL USE LA COMA ,");
        notad=lector.nextFloat();
        
        promedioa=(((notaa+notab+notac)/3)*30)/100;
        promediob=((notad)*70)/100;
        
        total=promedioa+promediob;
        
        System.out.println("La nota del estudiante: "+nombre+" Para este parcial es: "+total);   
}
}