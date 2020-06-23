/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import static javax.swing.Action.NAME;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author Santiago
 */
public class Barra_Herramientas {
    static public void main (String[] args){
        BarraHerramientasJFrame mi;
        mi = new BarraHerramientasJFrame();
        mi.setVisible(true);
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class BarraHerramientasJFrame extends JFrame{
    
    private JButton salir;
    
    public BarraHerramientasJFrame(){
        this.setSize(500, 400);
        this.setLocation(200,200);
        this.setTitle("Menu con Barra de herramientas");
        
        add(new BarraHerramientasJPanel());
    }
    
    
    class BarraHerramientasJPanel extends JPanel{
        public BarraHerramientasJPanel(){
            
            this.setLayout(new BorderLayout());
            
            JMenuBar barMenu = new JMenuBar();
            JMenu menuColores = new JMenu("Color fondo");
            barMenu.add(menuColores);

            Action accionAmarillo = new OyenteAction("Amarillo", Color.YELLOW);
            Action accionRosa = new OyenteAction("Rosa", Color.PINK); 
            Action accionCyan = new OyenteAction("Cyan", Color.CYAN);
            
            JMenuItem colorA = new JMenuItem(accionAmarillo);
            JMenuItem colorR = new JMenuItem(accionRosa);
            JMenuItem colorC = new JMenuItem(accionCyan);
            menuColores.add(colorA);
            menuColores.add(colorR);
            menuColores.add(colorC);
            
            setJMenuBar(barMenu);
            
            // Barra de herramientas
            
            JToolBar barraHerra = new JToolBar();
            barraHerra.add(accionAmarillo);
            barraHerra.add(accionRosa);
            barraHerra.add(accionCyan);
            barraHerra.addSeparator();
            
            salir = new JButton("Salir");
            barraHerra.add(salir);
            salir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    System.exit(0);
                }
            });
            
            add(barraHerra, BorderLayout.NORTH);
        }
        
        class OyenteAction extends AbstractAction{

            public OyenteAction(String nombre, Color colorbg){
                this.putValue(NAME, nombre);
                this.putValue(SHORT_DESCRIPTION,
                            "Poner el fondo de color: " + nombre);
                this.putValue("COLOR BG", colorbg);
            }

            @Override
            public void actionPerformed(ActionEvent ae) {
                Color jcolorbg =(Color) this.getValue("COLOR BG");
                setBackground(jcolorbg);
            }

        }
    }
    
    
}


