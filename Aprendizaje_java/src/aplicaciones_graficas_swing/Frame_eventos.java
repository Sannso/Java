/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Frame_eventos {
    
    public static void main(String[] args){
        
        VentanaEventos miv;
        miv = new VentanaEventos();
        
        miv.setVisible(true);
        miv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    
}

class VentanaEventos extends JFrame{
    
    public VentanaEventos(){
        this.setSize(720, 480);
        this.setLocation(250, 150);
        this.setTitle("Ventana de eventos (prueba)");
        
        Image micat;
        String ruta = "src/aplicaciones_graficas_swing/gato.gif";
        micat = Toolkit.getDefaultToolkit().getImage(ruta);
        
        this.setIconImage(micat);
        
        CapaDeEventos capi;
        capi = new CapaDeEventos();
        
        add(capi);
        
    }
    
    
}



class CapaDeEventos extends JPanel implements ActionListener{
    
    private final JButton botonColor;
    private final JButton botonRectan;
    
    public CapaDeEventos(){
        botonColor = new JButton("Change Color");
        add(botonColor);
        
        botonColor.addActionListener(this);
    
        
        botonRectan = new JButton("Change Color Rectangle");
        add(botonRectan);
    
        botonRectan.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        Object botonPulsado = e.getSource(); // Obtiene el nombre de la variable
                                            // e.getActionCommand()
                                           // Obtiene el String del boton 
        
        
                                           
        //--------------------------------------------------------                                   
        boolean isequalBtn_y_BC;
        isequalBtn_y_BC = botonPulsado.equals(botonColor);
                             
        boolean isEqualBgd_y_Clr;
        isEqualBgd_y_Clr = this.getBackground() == Color.BLUE;
        
        
        if (isequalBtn_y_BC){
                if(isEqualBgd_y_Clr){
                    this.setBackground(Color.YELLOW);
                }
                else if(isEqualBgd_y_Clr){
                    this.setBackground(Color.BLUE);
                }
                else{
                    this.setBackground(Color.BLUE);
                }
        }
        
        
        
        //--------------------------------------------------------
        boolean botonPulsado_Y_botonRec;
        botonPulsado_Y_botonRec = botonPulsado.equals(botonRectan);
        
       
        boolean bacground_Y_Color;
        bacground_Y_Color = (this.getBackground() == Color.BLUE) || (this.getBackground() == Color.YELLOW); 
        
        
        if(botonPulsado_Y_botonRec){
            if(bacground_Y_Color){
                this.setBackground(Color.MAGENTA);
            }
            else{
                this.setBackground(Color.BLUE);
            }
        }
        
        
        
    }
    
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D cuadri = new Rectangle2D.Double(230, 180, 300, 200);
        g2.setPaint(Color.GREEN);
        g2.fill(cuadri);
        
        
    }
    
}