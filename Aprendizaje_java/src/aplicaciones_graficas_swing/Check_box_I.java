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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Check_box_I {
    static public void main(String[] args){
        CheckBoxFrame cbf;
        cbf = new CheckBoxFrame();
        cbf.setVisible(true);
        cbf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class CheckBoxFrame extends JFrame{
    private JLabel labelTxt;
    private JCheckBox negrita;
    private JCheckBox cursiva;
    
    public CheckBoxFrame(){
        this.setSize(500, 150);
        this.setLocation(200, 200);
        this.setTitle("Check Box Example");
        
        this.setLayout(new BorderLayout(5, 5));
        add(new TxtPanel(), BorderLayout.CENTER);
        add(new CheckBPanel(), BorderLayout.SOUTH);
    }
    
    
    class TxtPanel extends JPanel{
        public TxtPanel(){
            labelTxt = new JLabel("Este es el texto de prueba");
            labelTxt.setFont(new Font("Console", Font.PLAIN, 20));
            add(labelTxt);
        }
    }
    
    class CheckBPanel extends  JPanel{
        public CheckBPanel(){
            
            negrita = new JCheckBox("Bold", false);
            negrita.addActionListener(new actionCheckBox());
            
            cursiva = new JCheckBox("Italic", false);
            cursiva.addActionListener(new actionCheckBox());
            
            
            add(negrita);
            add(cursiva);
        }
    }
    
    class actionCheckBox implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            int tipo = 0;
            // 1 = Bold, 2 = Italic, 3 = Bold and Italic
            
            if(negrita.isSelected()) tipo += Font.BOLD;
            if(cursiva.isSelected()) tipo += Font.ITALIC;
            
            labelTxt.setFont(new Font("Consola", tipo, 20));
           
        }
        
    }
    
}