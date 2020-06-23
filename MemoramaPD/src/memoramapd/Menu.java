/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoramapd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


/**
 *
 * @author Santiago
 */
public class Menu extends JFrame  {
    public JPanel menu;
    public JButton nivel1;
    public JButton nivel2;
    public JButton nivel3;
    private Image fondopanel;
    
   
    public Color color(){
        Color cmenu= new Color(21,67,96);
        return cmenu;
    }
    public Menu panel_menu(){
        this.setResizable(false);
        this.setSize(1010,610);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("MEMORAMA");
        menu=new JPanel();
        this.menu.setLayout(null);
        this.menu.setBackground(color());
        menu.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(menu);  
        return this;
    }
    public JButton crear_niveles1(){
        ImageIcon Imageboton1=new ImageIcon("level1.png");
        nivel1=new JButton(Imageboton1);
        nivel1.setName("nivel1");
        nivel1.setBounds(325,100,400,100);
        menu.add(nivel1);
        return nivel1;
    }
    
    public JButton crear_niveles2(){
        ImageIcon Imageboton2=new ImageIcon("level2.png");
        nivel2=new JButton(Imageboton2);
        nivel2.setName("nivel2");
        nivel2.setBounds(325,250,400,100);
        menu.add(nivel2);
        return nivel2;
    }
    
    public JButton crear_niveles3(){
        ImageIcon Imageboton3=new ImageIcon("level3.png");
         nivel3=new JButton(Imageboton3);
        nivel3.setName("nivel3");
        nivel3.setBounds(325,410,400,100);
        menu.add(nivel3);
        return nivel3;
    }
    
    public JButton Nivel1(){
        return nivel1;
    }
    public JButton Nivel2(){
        return nivel2;
    }
    public JButton Nivel3(){
        return nivel3;
    }
    
    public Juego creacionjuego1(){
        Juego c1 = new Juego(1,this);
        return c1;
    }
    public Juego creacionjuego2(){
        Juego c2 = new Juego(2,this);
        return c2;
    }
    public Juego creacionjuego3(){
        Juego c3 = new Juego(3,this);
        return c3;
    }

 


   

    
    

    
}

