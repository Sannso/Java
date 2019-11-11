/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Santiago
 */
public class Cuadros_de_txt {
    public static void main(String[] args){
        Ventana_cuadrotxt mivf;
        mivf = new Ventana_cuadrotxt();
        
        mivf.setVisible(true);
        mivf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Ventana_cuadrotxt extends JFrame{
    
    private JLabel labelRespuesta;
    
    
    public Ventana_cuadrotxt(){
        this.setSize(400, 300);
        this.setLocation(200, 200);
        this.setTitle("Ventana con cuadro de texto");
        
        this.setLayout(new GridLayout(2, 1, 10, 10));
        
        add(new CapaCuadroDeTxt());
        add(new CapaCuadroAnswer());
    }
    
    class CapaCuadroDeTxt extends JPanel{
        JTextField CuadroTxt;

        public CapaCuadroDeTxt(){
            JLabel etiqueta = new JLabel("Ingrese su correo: ");
            add(etiqueta);
            CuadroTxt = new JTextField(15);
            add(CuadroTxt);

            JButton botonV = new JButton("Verificar");
            add(botonV);
            botonV.addActionListener(new EventoVeri());
        }

        class EventoVeri implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent ae) {
                String EntradaTxt = CuadroTxt.getText().trim();
                CheckEmail(EntradaTxt);
            }

        }


    }
    
    class CapaCuadroAnswer extends JPanel{

        public CapaCuadroAnswer() {
            
            labelRespuesta = new JLabel("", JLabel.CENTER);
            add(labelRespuesta); 
        }

    }
    
    
    private void CheckEmail(String EntradaTxt){
        boolean HayArroba = false;

        for(int i=0; i<EntradaTxt.length(); i++){
            if(EntradaTxt.charAt(i) == '@'){
                HayArroba = !HayArroba;
            }
        }

        if(HayArroba){
            labelRespuesta.setText("El correo el correcto");
            System.out.println("Correcto");
        }
        else{
            labelRespuesta.setText("El correo esta mal");
            System.out.println("Incorrecto");
        }
        this.repaint();
    }
}



