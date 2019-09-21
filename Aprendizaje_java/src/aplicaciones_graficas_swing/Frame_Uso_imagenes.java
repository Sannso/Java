/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Frame_Uso_imagenes {
    public static void main(String[] args){
        
        Ventana_imagenes mic;
        mic = new Ventana_imagenes();
        
        mic.setVisible(true);
        mic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class Ventana_imagenes extends JFrame{
    
    public Ventana_imagenes(){
        this.setSize(720, 480);
        this.setLocation(250, 150);
        
        this.setTitle("Ventana con imagenes");
        
        Capa_imagenes mica;
        mica = new Capa_imagenes();
        
        add(mica);
        
    }
}


class Capa_imagenes extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
     
        Image myimage;
        File rutaImagen;
        rutaImagen = new File("src/aplicaciones_graficas_swing/kisk.png");
        
        
        try{
            myimage = ImageIO.read(rutaImagen);
            int alto = myimage.getHeight(this);
            int ancho = myimage.getWidth(this);
            //g.drawImage(myimage, 100, 100, this);
            g.drawImage(myimage, 100, 100, ancho-400, alto-400, this);
        }
        catch(IOException e){
            System.out.println("Esa tal imagen no existe.");
        }
        
        
    }
}