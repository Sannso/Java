/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago
 */
public class Manipulacion_cadenas {
    
    public static void main(String[] arg){
        
       
        //ejemplo1();
        //ejemplo2();
        ejemplo3();
    }
    
    public static void ejemplo1(){
        
        String nombre = "Santiago";
        System.out.println(nombre);
        
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");
        
        System.out.println("La primera letra de " + nombre + " es: "
                            + nombre.charAt(0));
    }
    
    
    public static void ejemplo2(){
        // Sub string
       
        String frase = "Convertir esto a una subcadena";
       
        
        String subfrase = frase.substring(10, 30);
        
        System.out.println(frase);
        System.out.println(subfrase);
    }
    
    public static void ejemplo3(){
        // Comparar cadenas
        
        String alumno1 = "David";
        String alumno2 = "david";
        
        System.out.println("Tienen los alumnos el mismo nombre?: " + 
                alumno1.equals(alumno2));
        
        System.out.println("Tienen los alumnos el mismo nombre?: " + 
                alumno1.equalsIgnoreCase(alumno2));
    }
    
    
}
