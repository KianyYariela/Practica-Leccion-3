

package com.mycompany.practica3ejercicio1;

import javax.swing.JOptionPane;

public class PRACTICA3EJERCICIO1 {

    public static void main(String[] args) {
        float tiempoVuelta= 0.0F;
        float tiempoPits= 0.0F;
        float promedioVuelta = 0.0F;
        float promedioPits = 0.0F;
        float vueltaTotal = 0.0F;
        float pitsTotal = 0.0F;
        float porcentajeVuelta= 0.0F;
        
        for (int i=1; i<=10; i++) {
             String vuelta = JOptionPane.showInputDialog("Ingrese el tiempo por vuelta: "); 
          tiempoVuelta = Float.parseFloat(vuelta);
         
         
          vueltaTotal= vueltaTotal +tiempoVuelta;
        }  
        
        promedioVuelta= vueltaTotal/10;
        
        for (int i=1; i<=10; i++) {
            String pits = JOptionPane.showInputDialog("Ingrese el tiempo  por pits: "); 
          tiempoPits = Float.parseFloat(pits);
           pitsTotal= pitsTotal + tiempoPits;
        }
        promedioPits= pitsTotal/10;
        porcentajeVuelta = promedioPits * 100/promedioVuelta;
        
        System.out.println("Promedio por Vuelta: "+promedioVuelta);
        System.out.println("Promedio por Pits: "+promedioPits);
        System.out.println("Porcentaje del tiempo Pits de una vuelta es de: "+porcentajeVuelta);
        
        
        
        
    }
}
