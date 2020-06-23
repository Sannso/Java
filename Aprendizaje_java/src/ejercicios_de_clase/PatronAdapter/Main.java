/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronAdapter;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Main {
    
    private static Scanner scan = new Scanner(System.in);
    private static Motor motor;
    
    public static void main(String[] args) {
        int opcion;
        do{
            opcion = preguntarOpcion();
            switch(opcion){
                case 1:
                    motor = new MotorComun();
                    usarMotor();
                    break;
                
                case 2:
                    motor = new MotorEconomico();
                    usarMotor();
                    break;    
            
                case 3:
                    motor = new MotorElectricoAdapter();
                    usarMotor();
                    break;
                    
                case 4:
                    System.out.println("Cerrando programa!!...");
                    break;
            
                default:
                    System.out.println("La opcion ingresada no es valida");
            }
            System.out.println("\n\n");
        }while(opcion != 4);
    }

    public static int preguntarOpcion(){
        System.out.println("\n\n --------- Menu de opciones ---------\n\n");
        System.out.println("Encender motor comun        ---> 1");
        System.out.println("\nEncender motor economico    ---> 2");
        System.out.println("\nEncender motor electrico    ---> 3");
        System.out.println("\n SALIR                      ---> 4");
        System.out.println("\n\nSeleccione su opcion:  ");
        return Integer.parseInt( scan.nextLine());
    }
    
    public static void usarMotor(){
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
