/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Santiago
 */
public class RadioBotones_Ejercicio {
    static public void main(String[] args){
        frameButtons fb;
        fb = new frameButtons();
        fb.setVisible(true);
        fb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class frameButtons extends JFrame{
    
    private ButtonGroup grupoBotones;
    
    private JRadioButton textoPequeño;
    private JRadioButton textoMediano;
    private JRadioButton textoNormal;
    private JRadioButton textoGrande;
    private JRadioButton textoMuyGrande;
    
    private JLabel textoDeE;
    
    public frameButtons(){
        this.setSize(1200, 250);
        this.setLocation(100, 200);
        this.setTitle("Ejemplo Radio Botones");
        
        this.setLayout(new BorderLayout(5, 5));
        add(new TextExample(), BorderLayout.CENTER);
        add(new ButtonsExample(), BorderLayout.SOUTH);
    }
    
    
    class TextExample extends JPanel{
        public TextExample(){
            textoDeE = new JLabel("Este es el texto de ejemplo"
                    + " y no habla de quijote");
            
            textoDeE.setFont(new Font("Consola", Font.PLAIN, 25));
            add(textoDeE);
        }
    }
    
    class ButtonsExample extends JPanel{
        public ButtonsExample(){
            grupoBotones = new ButtonGroup();
            textoPequeño = new JRadioButton("Pequeño", false);
            textoMediano = new JRadioButton("Mediano", false);
            textoNormal = new JRadioButton("Normal", true);
            textoGrande = new JRadioButton("Grande", false);
            textoMuyGrande = new JRadioButton("Muy Grande", false);
            
            /*
            Esto se puede hacer creando una funcion que cree cada boton y 
            que le de funcionalidad y a la vez agregandolo al panel
            (enviandole los parametros a la funcion)
                    */
            
            CrearGrupoBotones();
            AgregarBotonesPanel();
            LlamadoEventosRadioB();
            
            
        }
        
        private void CrearGrupoBotones(){
            grupoBotones.add(textoPequeño);
            grupoBotones.add(textoMediano);
            grupoBotones.add(textoNormal);
            grupoBotones.add(textoGrande);
            grupoBotones.add(textoMuyGrande);
        }
        
        
        private void AgregarBotonesPanel(){
            add(textoPequeño);
            add(textoMediano);
            add(textoNormal);
            add(textoGrande);
            add(textoMuyGrande);
        }
        
        
        private void LlamadoEventosRadioB(){
            textoPequeño.addActionListener(new ActionRadioButtonL());
            textoMediano.addActionListener(new ActionRadioButtonL());
            textoNormal.addActionListener(new ActionRadioButtonL());
            textoGrande.addActionListener(new ActionRadioButtonL());
            textoMuyGrande.addActionListener(new ActionRadioButtonL());
        }
        
    }
    
    class ActionRadioButtonL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(textoPequeño.isSelected()){
                textoDeE.setFont(new Font("Consola", Font.PLAIN, 9));
            }
            else if(textoMediano.isSelected()){
                textoDeE.setFont(new Font("Consola", Font.PLAIN, 16));
            }
            else if(textoNormal.isSelected()){
                textoDeE.setFont(new Font("Consola", Font.PLAIN, 25));
            }
            else if(textoGrande.isSelected()){
                textoDeE.setFont(new Font("Consola", Font.PLAIN, 34));
            }
            else if(textoMuyGrande.isSelected()){
                textoDeE.setFont(new Font("Consola", Font.PLAIN, 50));
            }
        }
        
    }
    
    
}


