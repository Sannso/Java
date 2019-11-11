/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Santiago
 */
public class Areas_de_texto_II {
    public static void main(String[] args){
        AtIIFrame at;
        at = new AtIIFrame();
        at.setVisible(true);
        at.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class AtIIFrame extends JFrame{
    
    private JTextArea areaCuadro;
    private JButton botonTexto;
    private JButton botonSaltoLinea;
    private JScrollPane panelScrollAC;
    
    
    public AtIIFrame(){
        this.setSize(500, 250);
        this.setLocation(200, 200);
        this.setTitle("Ares de texto II");
        this.setResizable(false);
        
        
        this.setLayout(new BorderLayout(5, 5));
        add(new AtIIPanel_Center(), BorderLayout.CENTER);
        add(new AtIIPanel_South(), BorderLayout.SOUTH);
        
    }
    
    class AtIIPanel_Center extends JPanel{
        public AtIIPanel_Center(){
            areaCuadro = new JTextArea(8, 20);
            
            panelScrollAC = new JScrollPane(areaCuadro);
            add(panelScrollAC);
        }
    }

    class AtIIPanel_South extends JPanel{
        public AtIIPanel_South(){
            botonTexto = new JButton("Insertar texto");
            botonSaltoLinea = new JButton("Salto linea ON");
            add(botonTexto);
            add(botonSaltoLinea);
            
            botonTexto.addActionListener(new ActionButtons());
            botonSaltoLinea.addActionListener(new ActionButtons());
        }
    }
    
    private class ActionButtons implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource() == botonTexto){
                areaCuadro.append("En un lugar de la mancha de cuyo"
                        + " nombre no quiero acordarme...");
                
            }
            else if(ae.getSource() == botonSaltoLinea){
                boolean saltoL = !areaCuadro.getLineWrap();
                areaCuadro.setLineWrap(saltoL);
                botonSaltoLinea.setText(saltoL ? "Salto linea OF" : "Salto linea ON");
            }
        }
        
    }
}

