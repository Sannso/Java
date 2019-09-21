/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Santiago
 */
public class Frame_eventos_ventanas {
    public static void main(String[] args){
        
        MyVentana ventana1;
        ventana1 = new MyVentana();
        ventana1.setTitle("Venatana 1");
        
        ventana1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        MyVentana ventana2;
        ventana2 = new MyVentana();
        ventana2.setTitle("Ventana 2");
        
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
}


class MyVentana extends JFrame{

    public MyVentana(){
        this.setSize(720, 480);
        this.setLocation(200, 200);
        this.setVisible(true);
        
        EventVentanas claseEventosVen;
        claseEventosVen = new EventVentanas();
        
        this.addWindowListener(claseEventosVen);
        
    }
    
    
}


class EventVentanas implements WindowListener{

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Ventana cerrada");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Vetana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Ventana ¿desminimizada?");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Ventana desactivada");
    }
    
}



/*  Hay una forma de escribir la clase anterior de manera que no haya
    codigo que no se va a utilizar.

    Para ello se utiliza una clase llamada WindowAdapter, la cual implementa
    las siguientes interfaces: 
    - WindowFocusListener
    - WindowStateListener
    - WindowListener
    - EventListener
*/


/*
class EventVentanas extends WindowAdapter{

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Vetana minimizada");
    }



}

*/