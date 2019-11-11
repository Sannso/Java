/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

/**
 *
 * @author Santiago
 */
public class Eventos_foco_ventana extends JFrame implements WindowFocusListener{
    
    // Esto porque es la clase que hereda de JFrame y asi creamos la ventana
    Eventos_foco_ventana ventana1;
    Eventos_foco_ventana ventana2;
    
    public static void main(String[] args){
        Eventos_foco_ventana vt = new Eventos_foco_ventana();
        vt.iniciar();
    }
    
    private void iniciar(){
        ventana1 = new Eventos_foco_ventana();
        ventana2 = new Eventos_foco_ventana();
        
        ventana1.setBounds(100, 150, 480, 260);
        ventana2.setBounds(610, 150, 480, 260);
        
        ventana1.setVisible(true);
        ventana2.setVisible(true);
        
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ventana1.addWindowFocusListener(this);
        ventana2.addWindowFocusListener(this);
    }
    

    @Override
    public void windowGainedFocus(WindowEvent we) {
        if(we.getSource() == ventana1){
            ventana1.setTitle("Ventana 1 - Tengo el foco");
        }
        else{
            ventana2.setTitle("Ventana 2 - Tengo el foco");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent we) {
        if(we.getSource() == ventana1){
            ventana1.setTitle("");
        }
        else{
            ventana2.setTitle("");
        }
    }
}
