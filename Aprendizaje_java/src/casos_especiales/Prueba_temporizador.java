/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos_especiales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Santiago
 */
public class Prueba_temporizador {
    
    public static void main(String[] args){
    
        ActionListener lis;
        lis = new Mlistener();

        Timer tempohora;
        tempohora = new Timer(5000, lis);
                                         // primero cada cuandos milisegudnos
                                         // y el segundo es el objeto
                                         // que implementa el actionlistener(interface) 

        System.out.println("Comenzando el temporizador: ");
        tempohora.start();    
        
        JOptionPane.showMessageDialog(null, "Presiona aceptar para finalizar el programa");
        System.out.println("Programa finalizado");
    }
}

class Mlistener implements ActionListener{
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        Date hora_actual = new Date();
        System.out.println("Cada 5 segundos voy a mostrar la hora(fecha): "
                + hora_actual);
        
    }
}