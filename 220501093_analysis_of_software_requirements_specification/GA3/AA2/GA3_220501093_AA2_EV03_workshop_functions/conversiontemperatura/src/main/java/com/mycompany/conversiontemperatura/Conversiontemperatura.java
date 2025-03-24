//Realizar la conversión de una temperatura dada en grados Centígrados a grados Fahrenheit (Fórmula: F = (9/5) C + 32). 

package com.mycompany.conversiontemperatura;

import java.util.Scanner;

public class Conversiontemperatura {

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
                
        double cent=0, fahr=0;
        
        System.out.println("Ingrese el valor en oC ");
        cent=lector.nextInt();
        
        fahr=(cent*1.8)+32;
        
        System.out.println(cent+"oC equivalen a "+fahr+"oF");
    }
}
