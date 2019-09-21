/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Santiago
 */
public class Frame_centrado {
    public static void main(String[] args){
        Framecr pantalla;
        pantalla = new Framecr();
        
        pantalla.setVisible(true);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}


class Framecr extends JFrame{

    public Framecr(){
        // Primero integro o declaro las especificaciones del pc donde
        // corre el programa
        Toolkit pc;
        pc = Toolkit.getDefaultToolkit(); // "pc ahora conoce algunas
                                          // caracteristicas del pc"
                                          
                                          
        Dimension miPantalla = pc.getScreenSize(); // getScreenSize devuelve
                                                   // un valor de tipo Dimension
        
        int anchoPantalla = miPantalla.width;
        int altoPantalla = miPantalla.height;
                                                   
        this.setSize(720, 480); 
        this.setLocation((anchoPantalla-720)/2, (altoPantalla-480)/2);
        
        // Cambio el icono de la ventana
        Image image = pc.getImage("src/aplicaciones_graficas_swing/gato.gif");
        this.setIconImage(image);
        
        // Titulo
        this.setTitle("Mi ventana de pruebas");
        
        
        
    }
    
    
}