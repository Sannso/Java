/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Eventos_multiples_oyentes {
    public static void main(String[] args){
        VentanaPrincipal fds;
        fds = new VentanaPrincipal();
        
        fds.setVisible(true);
        fds.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class VentanaPrincipal extends JFrame{

    public VentanaPrincipal(){
        this.setTitle("Ventana principal");
        this.setBounds(820, 260, 480, 200);
        
        add(new CapaConBotones());
        
    }
   
}



class CapaConBotones extends JPanel{
    
    JButton boton_cerrar; 
    
    public CapaConBotones(){
        JButton boton_crear = new JButton("Nueva Ventana");
        boton_cerrar = new JButton("Cerrar Ventanas");
        
        add(boton_crear);
        add(boton_cerrar);
        
        boton_crear.addActionListener(new EventoCrearVentana());
    }
    
    
    private class EventoCrearVentana implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            VentanaEmergente newV;
            newV = new VentanaEmergente(boton_cerrar);
            newV.setVisible(true);
        }
    
    }
}



class VentanaEmergente extends JFrame{
    
    private static int contador = 0; 
    
    public VentanaEmergente(JButton cierreButton){
        contador++;
        
        this.setTitle("Ventana #" + contador);
        this.setBounds(30*contador, 30*contador, 350, 150);
       
        cierreButton.addActionListener(new CerrarVentanasEmergentes());
    }
 
    
    private class CerrarVentanasEmergentes implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            dispose();
            contador = 0;
        }
        
    }
    
}