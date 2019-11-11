/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author Santiago
 */
public class Eventos_mouse {
    public static void main(String[] args){
        Ventanamouse ventid;
        ventid = new Ventanamouse();
        ventid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Ventanamouse extends JFrame{
    
    public Ventanamouse(){
        this.setSize(720, 480);
        this.setLocation(230, 150);
        this.setTitle("Pruebas con eventos de mouse");
        this.setVisible(true);
        
        addMouseListener(new EventosdeRaton());
        addMouseMotionListener(new EventosdeRaton());
        
    }
    
}

class EventosdeRaton implements MouseListener, MouseMotionListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Total de clicks: " + me.getClickCount());
        
        System.out.println("En las posiciones X y Y: "
                    + me.getX() + ", "
                    + me.getY());
        
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Estas presionado el clik");
        
        // Por alguna razon no funciona en mouseClicked
        switch (me.getModifiersEx()) {
            case MouseEvent.BUTTON1_DOWN_MASK:
                System.out.println("Has hecho un click izquierdo");
                break;
            case MouseEvent.BUTTON2_DOWN_MASK:
                System.out.println("Has hecho un click con la rueda");
                break;
            case MouseEvent.BUTTON3_DOWN_MASK:
                System.out.println("Has hecho un click derecho");
                break;
            default:
                System.out.println("Cual presionaste?");
                break;
        }
        
    }
    
    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Has soltado el click");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("El puntero ha ingresado a la ventana");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("El puntero ha salido de la ventana");
    }

    
    
    // ---------------------- MouseMotionListener ----------------------------
    
    @Override
    public void mouseDragged(MouseEvent me) {
        System.out.println("Estas arrastrando el puntero");
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        System.out.println("Estas moviendo el puntero solamente");
    }
    
}