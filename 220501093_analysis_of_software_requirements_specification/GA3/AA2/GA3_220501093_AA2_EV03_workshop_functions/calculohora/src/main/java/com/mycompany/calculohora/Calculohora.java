package com.mycompany.calculohora;

import java.util.Scanner;

public class Calculohora {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String hora, h, m, s;
        int hr=0, mn=0, sg=0;
                
        System.out.println("Ingrese la hora en el formato HH.MM.SS para calcular que hora sera en el siguiente segundo");
        hora = lector.nextLine();
        
        h=hora.substring(0, 2);
        m=hora.substring(3, 5);
        s=hora.substring(6, 8);
        
        hr = Integer.parseInt(h);
        mn = Integer.parseInt(m);
        sg = Integer.parseInt(s);
        
        if(hr < 24 & mn < 60 & sg < 60){
          if(sg < 59 && sg >= 0){
          System.out.println(hr+"h "+mn+"m "+(sg+1)+"s");
          }else{
            if(sg==59){
                  if(mn==59){
                      if(hr==23){
                          System.out.println("00h 00m 00s");
                      }else{
                          System.out.println((hr+1)+"h 00m 00s");
                      }
                  }else{
                      System.out.println(h+"h "+(mn+1)+"m 00s");
                  }
              }
          }
        }else{
          System.out.println("Fuera de Rango");
      }
     }
}
