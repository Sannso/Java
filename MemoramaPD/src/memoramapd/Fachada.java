package memoramapd;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Maria Camila
 */
public class Fachada extends JFrame implements ActionListener {
     Menu menu;
     JFrame n;
     
    public Fachada(){
        menu=new Menu();   
        n=menu.panel_menu();
        //menu.crear_niveles();
        JButton nivel1,nivel2,nivel3;
        nivel1=menu.crear_niveles1();
        nivel2=menu.crear_niveles2();
        nivel3=menu.crear_niveles3();
        nivel1.addActionListener(this);
        nivel2.addActionListener(this);
        nivel3.addActionListener(this);
        menu.setVisible(true);
        
    }
    
    public void crearjuegos(int i){
        if(i==1){
        Juego c1= menu.creacionjuego1();
        menu.setVisible(false);
        c1.setVisible(true);
        }
        if(i==2){
        Juego c2 = menu.creacionjuego2();
        menu.setVisible(false);
        c2.setVisible(true);
        }
        if(i==3){
        Juego c3 = menu.creacionjuego3();
        menu.setVisible(false);
        c3.setVisible(true);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==menu.nivel1){            
           crearjuegos(1);
        }if(e.getSource()==menu.nivel2){
           crearjuegos(2);
        }if(e.getSource()==menu.nivel3){
            crearjuegos(3);
        }
    }
    
    
    
    
}
