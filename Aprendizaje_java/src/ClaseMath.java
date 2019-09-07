/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago
 */
public class ClaseMath {
    
    public static void main (String[] arg){
        
        // La clase math tiene muchos metodos para hacer calculos
        
        // Uso de la raiz cuadrada
        double n = 64;
        
        double r;
        
        r = Math.sqrt(n);
        
        System.out.println("La raiz cuadrada de " + n + " es: " + r);
        
        
        // Veamos como se hace refundacion que es cambiar el tipo de dato
        
        double num = 6.28;
        
        int result = (int)Math.round(num); // round convierte de double a long
                                          // y de float a int, por eso el cambio
                
        System.out.println("Redondeo de " + num + " es: " + result);
    }
}
