/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;


import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Eventos_teclado {
    public static void main(String[] args){
        Ventanafd newf;
        newf = new Ventanafd();
        
        newf.setVisible(true);
        newf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    
}

class Ventanafd extends JFrame{
    
    public Ventanafd(){
        this.setSize(720, 480);
        this.setLocation(230, 150);
        this.setTitle("Test de evento de teclado");
        
        Capateclado laca;
        laca = new Capateclado();
        
        add(laca);
        
        addKeyListener(laca);
        
    }
    
    
    private String palabra = "v";
    
    protected class Capateclado extends JPanel implements KeyListener{
        
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            
            g.drawString(palabra, 100, 100);
        }
        
        
        @Override
        public void keyTyped(KeyEvent ke) {
            palabra = palabra + ke.getKeyChar();
            System.out.println(palabra);
            System.out.println("Tecla presionada: " + ke.getKeyChar());
            this.repaint();
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            
        }
        
    }
    
    
    // LO AGREGUE EN LA CAPA PARA PODER REFRESCAR LA CAPA
    // Y SE PUEDA VER LA ACCION
    /*
    protected class EventoTeclado implements KeyListener{

        @Override
        public void keyTyped(KeyEvent ke) {
            palabra = palabra + ke.getKeyChar();
            System.out.println(palabra);
            System.out.println("Tecla presionada: " + ke.getKeyChar());
            
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            
        }
        
    }
    */
}