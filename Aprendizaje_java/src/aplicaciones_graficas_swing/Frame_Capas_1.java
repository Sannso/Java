/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Frame_Capas_1 {
    public static void main(String[] args){
        
        Ventana1 mivi = new Ventana1();
        mivi.setVisible(true);
        
        mivi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}



class Ventana1 extends JFrame{
    
    public Ventana1(){
        this.setSize(720, 480);
        this.setLocation(200, 200);
        this.setTitle("Mi ventana de pruebas");
        
        Image image_cat;
        image_cat =
                Toolkit.getDefaultToolkit().getImage
                                    ("src/aplicaiones_graficas_swing/gato.gif");
        
        
        this.setIconImage(image_cat);
        
        CapaD miCapa;
        miCapa = new CapaD();
        add(miCapa);
    }
}


class CapaD extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);    // Ejecuta posiblemente lo que crea la capa
        
        g.drawString("Por fin pudimos poner un mensaje", 50, 50);
    }
    
}