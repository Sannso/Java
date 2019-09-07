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

public class Condicionales_bucles {
    
    public static void main(String[] args) {
        
        // Basicamente if, switch, etc... es igual que en otros lenguajes
        
        //ejemplo1();
        //ejemplo2();
        //ejemplo3();
        //ejemplo4();
        //ejemplo5();
        ejemplo6();
    }
    
    
    public static void ejemplo1(){
        
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.print("\nIngresa tu edad: ");
        int edad = input.nextInt();
        
        if(edad > 3 && edad < 18){
            System.out.println("Eres menor de edad");
        }
        
        else if(edad > 3 && edad < 36){
            System.out.println("Estas joven y eres mayor de edad");
        }
        
        else if(edad > 3 && edad < 60){
            System.out.println("Ya estas maduro!");
        }
        
        else if(edad > 3 && edad < 90){
            System.out.println("Ya estas muy viejo, ten cuidado");
        }
        
        else{
            System.out.println
                        ("No creo que tengas esa edad debes estar equivocado");
        }
        
        input.close();
    }
    
    
    
    public static void ejemplo2(){
        
        Scanner input;
        input = new Scanner(System.in);
   
        System.out.println("Progama calculador de areas: ");
        System.out.println("1. Cuadrado \n2. Circulo \n3. Triangulo ");
        System.out.print("Escoja un opcion: ");
        
        int figura = input.nextInt();
        
        switch(figura){
            
            case 1:            
                double lado =
                        Double.parseDouble(JOptionPane.showInputDialog
                                          ("Introduzca el lado del cuadrado:"));
                
                System.out.print("\nEl Area del cuadrado es: ");
                System.out.printf("%1.2f", (Math.pow(lado, 2)));
                System.out.println("\nPrograma finalizado.\n");
            break;
            
            
            case 2:
                double radio =
                        Double.parseDouble(JOptionPane.showInputDialog
                                         ("Introduzca el radio del circulo: "));
                
                System.out.print("\nEl Area del circulo es: ");
                System.out.printf("%1.2f", (Math.PI * Math.pow(radio, 2)));
                System.out.println("\nPrograma finalizado.\n");
            break;
            
            
            case 3:
                double base =
                        Double.parseDouble(JOptionPane.showInputDialog
                                        ("Introduzca la base del triangulo: "));
                
                double altura =
                        Double.parseDouble(JOptionPane.showInputDialog
                                      ("Introduzca la altura del triangulo: "));
                
                System.out.print("\nEl Area del triangulo es: ");
                System.out.printf("%1.2f", ((base * altura)/2));
                System.out.println("\nPrograma finalizado.\n");
            break;
        
        
            default:
                System.out.println("Te equivocaste elige nuevamente...");
            break;
        }
        
    }

    public static void ejemplo3(){
         // Uso del bucle while
    
         String clave, pass;
         clave = "Santiago";
         pass = "";
         
         while(pass.equals(clave) == false){
             
            pass = JOptionPane.showInputDialog("Introduzca la contraseña: ");
            
            if(pass.equals(clave) == false){
                System.out.println("Contraseña incorrecta. vuelva a intentar");
            }
             
         }
         
         System.out.println("Contraseña correcta, has ingresado al sistema");
         
    }
    
    
    public static void ejemplo4(){
        // Utilizacion de random. random genera un numero de 0.0 a 1.0
        
        int random = (int)(Math.random() * 100); // realmente nunca sale a 100
        int usuario;
        int contador = 0;
        //String Cmessage = "";
        String num;
        
        
        System.out.println
                ("Seras capaz de adivinar el numero en menos de 10 intentos?");
                 
       
        num = JOptionPane.showInputDialog("Ingresa un numero: ");
        usuario = Integer.parseInt(num);
        contador++;
        //Cmessage = 
        
        while(usuario != random){
            
            int diference = Math.abs((usuario - random));
            
            if(usuario < 0 || usuario > 100){
                num = JOptionPane.showInputDialog
                               ("Amigo es de 0 a 100.  - Intendo #" + contador);
                usuario = Integer.parseInt(num);
                contador++;
            }
           
            else if(diference < 6){
                num = JOptionPane.showInputDialog
                                        ("Hirviendo!!  - Intendo #" + contador);
                usuario = Integer.parseInt(num);
                contador++;  
            }
            
            else if(diference < 20){
                num = JOptionPane.showInputDialog
                                           ("Caliente  - Intendo #" + contador);
                usuario = Integer.parseInt(num);
                contador++;  
            }
            
            else if(diference < 41){
                num = JOptionPane.showInputDialog
                                            ("Tibio  - Intendo #" + contador);
                usuario = Integer.parseInt(num);
                contador++;  
            }
            
            else if(diference < 65){
                num = JOptionPane.showInputDialog
                                            ("Frio  - Intendo #" + contador);
                usuario = Integer.parseInt(num);
                contador++;  
            }
            
            else if(diference < 85){
                num = JOptionPane.showInputDialog
                                        ("Congelado  - Intendo #" + contador);
                usuario = Integer.parseInt(num);
                contador++;  
            }
            
            else if(diference < 100){
                num = JOptionPane.showInputDialog
                                        ("Permafrost  - Intendo #" + contador);
                usuario = Integer.parseInt(num);
                contador++;  
            }
        }
        
        if(contador <= 10){
            System.out.println("¡Lo lograste!."
                    + " Lo hiciste en 10 o menos intentos!! ");
        }
        else{
            System.out.println("Lo adivinaste pero en mas de 10 intentos. "
                    + "Vuelve a intentarlo :D");
        }
    }
    
    public static void ejemplo5(){
        // Programa que verifica si una cadena es un correo o no, a priori
            // solo evalua su lleva @ y que no tenga espacios
            
        Scanner input;
        input = new Scanner(System.in);
        
        String correo;
        
        
        System.out.println("Sistema de correos.\n");
        System.out.print("Ingrese su correo electronico: ");
        correo = input.nextLine();
        System.out.println("\n");
       
        
        short espacios = 0;
        short arroba = 0; 
        
        for(int i=0; i<(correo.length()); i++){
            if(correo.charAt(i) == ' '){
                espacios++;
            }
            else if(correo.charAt(i) == '@'){
                arroba++;
            } 
            
        } 
        
        if(espacios >= 1){
            System.out.println
                    ("Correo invalido, el correo no puede contener espacios.");
        }
        else if(arroba != 1){
            if(arroba < 1){
                System.out.println("Correo invalido, no contiene el @");
            }
            else{
                System.out.println("Correo invalido, hay mas de 1 @");
            }
        }
        else{
            System.out.println("El correo ha sido ingresado exitosamente!!");
        }
        
        
        input.close();
    }
    
    public static void ejemplo6(){
        // Calcular factorial
        
        Scanner input;
        input = new Scanner(System.in);
        
        int num;
        int result = 1;
        
        System.out.println("Sistema para calcular el factorial de un numero.\n");
        System.out.print("Ingrese el numero: ");
        num = input.nextInt();
    
        if(num == 0){
                
            System.out.println("El resultado es: 1");
        }
        else{
            for(int i=1; i<=num ;i++ ){
                result = result*i;
            }
            System.out.println("El resultado es: " + result);
        }
    }
}
