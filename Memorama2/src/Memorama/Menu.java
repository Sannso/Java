/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memorama;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.*;


/**
 *
 * @author Maria Camila
 */
public class Menu extends JFrame implements ActionListener{
    public JPanel menu;
    public JButton nivel1;
    public JButton nivel2;
    public JButton nivel3;
    
    Color cmenu= new Color(0,255,255);
    
    
   
    public Menu(){
    this.setResizable(false);
    this.setSize(1010,650);
    panel_menu();    
    crear_niveles();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);//cierre de ventanas
    this.setTitle("MEMORAMA");//titulo de la ventana
    }
    
    public void panel_menu(){
    menu=new JPanel();
    
    menu.setLayout(null);
    
    menu.setBackground(cmenu);
    
    this.getContentPane().add(menu);
    }
    
    public void crear_niveles(){
    ImageIcon Imageboton1=new ImageIcon("level1.png");
    
    nivel1=new JButton(Imageboton1);
    nivel1.setName("nivel1");
    nivel1.setBounds(305,100,400,100);
    menu.add(nivel1);
    nivel1.addActionListener(this);
    
    ImageIcon Imageboton2=new ImageIcon("level2.png");
     nivel2=new JButton(Imageboton2);
    nivel2.setName("nivel2");
    nivel2.setBounds(305,250,400,100);
    menu.add(nivel2);
    nivel2.addActionListener(this);
    
    
    ImageIcon Imageboton3=new ImageIcon("level3.png");
     nivel3=new JButton(Imageboton3);
    nivel3.setName("nivel3");
    nivel3.setBounds(305,410,400,100);
    menu.add(nivel3);
    nivel3.addActionListener(this);
    
    }

    
    @Override
    public void actionPerformed(ActionEvent e) { 
    if(e.getSource()==nivel1){
        Ventana c1=new Ventana(1);
        c1.setVisible(true);
    
    }if(e.getSource()==nivel2){
        Ventana c2=new Ventana(2);
        c2.setVisible(true);
    }if(e.getSource()==nivel3){
        Ventana c3=new Ventana(3);
        c3.setVisible(true);
    }
}


    
    
    
    
    
}
