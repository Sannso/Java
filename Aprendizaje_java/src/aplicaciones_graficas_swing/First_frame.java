/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author Santiago
 */
public class First_frame {
    public static void main(String[] args){
        
        Ventana miFrame;
        miFrame = new Ventana();
        
        miFrame.setVisible(true);
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}


class Ventana extends JFrame{
    
    public Ventana(){
        //this.setSize(720, 480); // Establece el tamaño de la ventana/frame
        
        this.setBounds(100, 100, 720, 480); // los primeros 2 es la posicion
                                            // en la resolucion de mi pantalla
        
        //this.setResizable(false); //permite establecer si se puede alargar o no
        
        this.setTitle("Mi ventana de pruebas"); // Titulo de la ventana
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximiza la pantalla
         
    }
}