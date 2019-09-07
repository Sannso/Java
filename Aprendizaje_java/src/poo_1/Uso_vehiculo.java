/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1;

//import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Uso_vehiculo {
    public static void main(String[] arg){
        /*
        Coche mazda;
        mazda = new Coche();
        
        Scanner input;
        input = new Scanner(System.in);
        
        
    
        System.out.println("----- Consencionario de autos -----");
        System.out.println("Color del auto: \n1. Rojo \n2. Azul \n3. Blanco");
        System.out.print("Elegir: ");
        
        int color;
        color = input.nextInt();
        
        switch (color) {
            case 1:
                mazda.setColor("Rojo");
                break;
                
            case 2:
                mazda.setColor("Azul");
                break;
                
            case 3:
                mazda.setColor("Blanco");
                break;
                
            default:
                break;
        }
        
        
        mazda.caracteristicas();
        */
        
        
        Furgoneta mifurgo;
        mifurgo = new Furgoneta(380, 6);
        
        System.out.println(mifurgo.getDatosFurgoneta());
        mifurgo.setColor("Verde");
        mifurgo.caracteristicas();
        
    }
}
