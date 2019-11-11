/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Layouts {
    public static void main(String[] args){
        VentanaLay dfsa;
        dfsa = new VentanaLay();
        
        dfsa.setVisible(true);
        dfsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class VentanaLay extends JFrame{
    
    public VentanaLay(){
        this.setBounds(450, 200, 400, 200);
        this.setTitle("Ventana de layouts");
 
        this.setLayout(new BorderLayout(10, 10));
        
        add(new CapaLayout(), BorderLayout.NORTH);
        add(new CapaLayout2(), BorderLayout.SOUTH);
        
    }
}

class CapaLayout extends JPanel{

    public CapaLayout() {
        
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        
        add(boton1);
        add(boton2);
    }
    
    
}


class CapaLayout2 extends JPanel{

    public CapaLayout2() {
        
        this.setLayout(new BorderLayout(10, 10));
        
        
        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");
        
        add(boton1, BorderLayout.WEST);
        add(boton2, BorderLayout.CENTER);
        add(boton3, BorderLayout.EAST);
    }
    
    
}