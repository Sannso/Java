/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos_especiales;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Santiago
 */

/*
    APARTE DE LA CLASE INTERNA TAMBIEN HAY CLASES INTERNAS LOCALES
    QUE SON CLASES DENTRO DE METRODOS ENCAPSULANDOLAS AUN MAS.
    
*/
public class Temporizador_clases_internas {
    public static void main(String[] args){
        
        Tempor miTemporizador;
        miTemporizador = new Tempor(3000, true);
        miTemporizador.iniciarTemporizador();
        
        JOptionPane.showMessageDialog(
                null,
                "Presionas aceptar para finalizar el programa");
    }
}


class Tempor{
    
    private final int tiempo;
    private final boolean sonido;
    
    public Tempor(int tiempo, boolean sonido){
        this.tiempo = tiempo;
        this.sonido = sonido;
    }
    
    public void iniciarTemporizador(){
        Timer tem;
        ActionListener escuchador_evento = new Hora();
        
        tem = new Timer(tiempo, escuchador_evento);
        tem.start();
    }
    
    
    private class Hora implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            Date horaActual;
            horaActual = new Date();
            
            System.out.println("Se imprimira la hora(fecha) cada 3 segundos: -> "
                    + horaActual);
            if(sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    
}