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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class ComboBox_opciones_desplegables {
    public static void main(String[] args){
        ComboBoxFrame f;
        f = new ComboBoxFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class ComboBoxFrame extends JFrame{
    
    private JLabel texto;
    private JComboBox comboBox;
    
    public ComboBoxFrame(){
        this.setSize(350, 350);
        this.setLocation(200, 200);
        this.setTitle("ComboBox");
        
        add(new ComboBoxPanel());
    }
    
    
    class ComboBoxPanel extends JPanel{
        public ComboBoxPanel(){
            this.setLayout(new BorderLayout(5, 5));
            
            texto = new JLabel("Este es el texto de prueba");
            texto.setFont(new Font("Console", Font.PLAIN, 20));
            
            comboBox = new JComboBox();
            comboBox.setEditable(true);
            comboBox.addItem("Serif");
            comboBox.addItem("Bell MT");
            comboBox.addItem("Britannic");
            comboBox.addItem("Calibri");
            
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    String itemSeleccionado;
                    itemSeleccionado =(String) comboBox.getSelectedItem();
                    texto.setFont(new Font(itemSeleccionado, Font.PLAIN, 20));
                }
            });
            
            add(texto, BorderLayout.CENTER);
            add(comboBox, BorderLayout.NORTH);
        }
    }
    
}


