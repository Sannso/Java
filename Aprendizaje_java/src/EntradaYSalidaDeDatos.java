/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago
 */

import java.util.Scanner;
import javax.swing.*;


public class EntradaYSalidaDeDatos {
    
    public static void main(String[] arg){
         
        // Nota: cuando un objeto es estatico significa que lleva el nombre 
        // de la clase/metodo precediendolo
        
        // Cuando el metodo no es estatico se tiene que instanciar un objeto
        // como en el ejemplo 1
        
  
        //ejemplo1();
        //ejemplo2();
        ejemplo3();
    }
    
    
    
    public static void ejemplo1(){
        Scanner input;
        input = new Scanner(System.in);         // Crea objeto de la clase
                                              //scanner utilizando el contructor
                                        // en este caso Scanner(System.in)
                                       // que lee o saca informacion de consola
        
        
        System.out.println("Introduce tu nombre: ");
        
        String nombre = input.nextLine();
        
        System.out.println("El nombre que introduciste fue: " + nombre);
        
        
        input.close();
    }
    
    public static void ejemplo2(){
        
        // Usamos otra forma de optener datos del usuario y tambien
        // como se transforma un string a un entero
        
        String nombre_de_usuario = 
                JOptionPane.showInputDialog("Introduce tu nombre porfavor: ");
        
        
        String edad_usuario =
                JOptionPane.showInputDialog("Introduce tu edad porfavor: ");
        
       
        
        int edad = Integer.parseInt(edad_usuario);
                            // Esta es la forma para transformar de string a int
        
        System.out.println("Tu nombre es " + nombre_de_usuario + "?");
        System.out.println("El año que viene tendras " + (edad++) + " años");
        
        
    }
    
    public static void ejemplo3(){
        
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.println("Sistema de division de dos numeros");
        System.out.print("Ingrese el 1er numero: ");
        
        double num1 = input.nextDouble();
        
        System.out.print("\nIngrese el 2do numero: ");
        
        double num2 = input.nextDouble();
        
        System.out.println("\nEl resultado es: " + (num1/num2));
        
        
        System.out.print("El resultado simplificado es: ");
        // Para simplificar o acortar los decimilaes se hace lo siguiente
            // printf = imprimir de la forma...
        
        System.out.printf("%1.2f", (num1/num2));
        System.out.println("\n");
     
        input.close();
    }
}
