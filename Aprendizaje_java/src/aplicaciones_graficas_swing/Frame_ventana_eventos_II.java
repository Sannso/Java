/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Frame_ventana_eventos_II {
    public static void main(String[] args){
        
        Ventanita ymv;
        ymv = new Ventanita();
        
        ymv.setTitle("Ventana pruebas de estado");
        ymv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Ventanita extends JFrame{
    
    public Ventanita(){
        this.setSize(720, 480);
        this.setLocation(200, 150);
        this.setVisible(true);
        
        add(new CapaDeTexto());
        
        addWindowStateListener(new EstadosVentana());
    }
    
    
}

class CapaDeTexto extends JPanel{
    public static int WindowS;
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        //Antialiasing (Ni idea de como funciona, otra persona lo compartio)
        g2.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON));
        
        g2.setColor(Color.BLUE);
        
        if(WindowS == JFrame.MAXIMIZED_BOTH){
            Toolkit pc = Toolkit.getDefaultToolkit();
            int altopa = pc.getScreenSize().height;
            
            g2.setFont(new Font("Consolas", Font.ITALIC, 35));
            g2.drawString("VENTANA MAXIMIZADA", 500, altopa/2);
            
        }
        else if(WindowS == 0){
            
            g2.setFont(new Font("Consolas", Font.BOLD, 25));
            g2.drawString("Confirmamos que: ", 100, 77);
            g2.drawString("VENTANA EN ESTADO BASE", 100, 100);
        }
        
        
    }
    
    
}



class EstadosVentana implements WindowStateListener{
    
    @Override
    public void windowStateChanged(WindowEvent w){
        
        switch (w.getNewState()) {
            case JFrame.MAXIMIZED_BOTH:
                System.out.println("Ventana maximizada");
                CapaDeTexto.WindowS = JFrame.MAXIMIZED_BOTH;
                break;
            
            case 0:
                System.out.println("Estado base de la ventana");
                CapaDeTexto.WindowS = 0;
                break;
            
            case JFrame.ICONIFIED:
                System.out.println("Ventana minimizada");
                CapaDeTexto.WindowS = JFrame.ICONIFIED;
                break;
            
            default:
                break;
        }
        
    }
}