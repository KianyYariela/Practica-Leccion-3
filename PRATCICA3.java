

package com.mycompany.pratcica3;

import javax.swing.JOptionPane;

public class PRATCICA3 {

    public static void main(String[] args) {
        
        int niños = 0;  //Cantidad de niños a pedir
        int menorCien = 0;
        int menorCientoVeinte = 0;
        int menorCientoTreinta = 0;
        int menorCientoCuarenta= 0;
        int mayorCientoCuarenta= 0;
        float estaturaTotal = 0.0F;
        float promedio = 0.0F;
        
     String numNiños = JOptionPane.showInputDialog("Ingrese la cantidad de niños: "); //Cantidad de niños
     niños = Integer.parseInt(numNiños);
     for (int i = 1;i <= niños; i++) {  
         String estatura = JOptionPane.showInputDialog("Ingrese la estatura del niño: "); //1 crear una variable string y guardar en esa variable la estatura
         float altura = Float.parseFloat(estatura);     //2 convertir la variable de string a flotante 
         estaturaTotal = estaturaTotal + altura;          // en la variable estatura va a ser igual a estaturatotal + la nueva estatura
         
         if (altura < 100) {  // 3 if estatura es menor a 100 cm
             menorCien ++;
         }
         
         if(altura>= 100&&altura<=120) {
             menorCientoVeinte++;  
         }
         
         if(altura>= 121&&altura<=130) {
             menorCientoTreinta++;  
         }
         
        if(altura>= 131&&altura<=140) {
             menorCientoCuarenta++;  
         }     
       if(altura < 140) {
             mayorCientoCuarenta++;  
         }   
         
     }
          promedio= estaturaTotal / niños; // promedio es igual a estatura total dividido entre niños.
     
                 System.out.println("Niños que miden menor a 100: "+menorCien);
                 System.out.println("Niños que miden entre 100 y 120 cm: "+menorCientoVeinte);
                 System.out.println("Niños que miden entre 121 y 130 cm: "+menorCientoTreinta);
                 System.out.println("Niños que miden entre 131 y 140 cm: "+menorCientoCuarenta);
                 System.out.println("Niños que miden más de 140cm: "+mayorCientoCuarenta);
                 System.out.println("Promedio de estaturas: "+ promedio );
                 System.out.println("Resultados obtenidos: ");
                 
    }
}
