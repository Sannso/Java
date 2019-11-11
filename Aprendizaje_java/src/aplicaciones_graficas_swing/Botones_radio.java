/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Santiago
 */
public class Botones_radio {
    static public void main(String[] args){
        RadioButtonFrame im;
        im = new RadioButtonFrame();
        im.setVisible(true);
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class RadioButtonFrame extends JFrame{
    public RadioButtonFrame(){
        this.setSize(270, 300);
        this.setLocation(200, 200);
        this.setTitle("Botones de Radio");
        
        add(new RadioPanel());
    }
}

class RadioPanel extends JPanel{
    public RadioPanel(){
        this.setLayout(new GridLayout(4, 1, 6, 6));
        
        ButtonGroup grupoBotones;
        grupoBotones = new ButtonGroup();
        
        JRadioButton botonRojo;
        botonRojo = new JRadioButton("Rojo", false);
        
        JRadioButton botonVerde;
        botonVerde = new JRadioButton("Verde", true);
        
        JRadioButton botonAmarillo; 
        botonAmarillo = new JRadioButton("Amarillo", false);
        
        grupoBotones.add(botonRojo);
        grupoBotones.add(botonVerde);
        grupoBotones.add(botonAmarillo);
        
        add(new JLabel("Escoge un color porfavor: "));
        add(botonRojo);
        add(botonVerde);
        add(botonAmarillo);
        
        
    }
}
