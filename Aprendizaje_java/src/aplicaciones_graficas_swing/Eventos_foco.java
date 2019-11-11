/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Santiago
 */
public class Eventos_foco {
    public static void main(String[] args){
        Miventi fiu;
        fiu = new Miventi();
        fiu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Miventi extends JFrame{
    
    private final JTextField cuadro1 = new JTextField();
    private final JTextField cuadro2 = new JTextField();
    
    public Miventi(){
        this.setBounds(250, 150, 720, 480);
        this.setTitle("Pruebas de foco");
        this.setVisible(true); 
        
        cuadro1.setBounds(100, 60, 200, 20);
        cuadro2.setBounds(100, 95, 200, 20);
        
        add(new Lacapitafoco());
        
        //(los Listener estaban en la capa)
        // lo traslado porque hacia muchos llamados
        
        cuadro1.setText("Aqui va tu correo");
        cuadro2.setText("Aqui va tu Nombre");
            
        cuadro1.addFocusListener(new OreCuadre());
        cuadro2.addFocusListener(new OreCuadre());
        
        
        
    }
    
    class Lacapitafoco extends JPanel{
        
        // Todo esto tambien funciona solo en el Frame
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            
            this.setBackground(Color.WHITE);
            
            this.setLayout(null);
            
            add(cuadro1);
            add(cuadro2);
        }
        
    }
    
    class OreCuadre implements FocusListener{

        @Override
        public void focusGained(FocusEvent fe) {
            
            if(fe.getSource() == cuadro1){
                cuadro1.setText("");
            }
            else{
                cuadro2.setText("");
            }
            
        }

        @Override
        public void focusLost(FocusEvent fe) {
            // ---------- Verificador de que el campo tenga algo ---------
           
            boolean cuadro1tienealgo = (cuadro1.getText()).length() > 0;
            boolean cuadro2tienealgo = (cuadro2.getText()).length() > 0;
            
            
            //--------------------- cuadro 1 -------------------------------
            
            if(fe.getSource() == cuadro1 && cuadro1tienealgo){
           
                String contenedor = cuadro1.getText();
                boolean verificador = false;
                
                for(int i=0; i<contenedor.length(); i++){
                    if(contenedor.charAt(i) == '@'){
                        verificador = !verificador;
                    }
                }
                
                if(verificador){
                    System.out.println("El correo es correto por ahora");
                }
                else{
                    System.out.println("El correo no es correcto");
                }
                
                
            }
            else{
                cuadro1.setText("Aqui va tu correo");
            }
            
            
            //--------------------- cuadro 2 -------------------------------
            if(fe.getSource() == cuadro2 && cuadro2tienealgo){
                    
            }
            else{
                cuadro2.setText("Aqui va tu Nombre");
            }
           
        }
        
    }
    
}
