/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Santiago
 */
public class JSpinner_I {
    public static void main (String[] args){
        JSpinnerFrame m;
        m = new JSpinnerFrame();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class JSpinnerFrame extends JFrame{
    public JSpinnerFrame(){
        this.setSize(500, 300);
        this.setLocation(200, 200);
        this.setTitle("JSpinner");
        
        add(new JSpinnerPanel());
    }
    
    
    
    class JSpinnerPanel extends JPanel{
        public JSpinnerPanel(){
            //this.setLayout(new GridLayout(3, 1, 10, 10));
            
           
            JSpinner spinner;
            spinner = new JSpinner();
            
            JSpinner spinner2 = new JSpinner(new SpinnerDateModel());
            
            JSpinner spinner3 = new JSpinner(new SpinnerNumberModel(0, -20, 20, 2){
                
                @Override
                public Object getNextValue(){
                    return super.getPreviousValue();
                }
                
                @Override
                public Object getPreviousValue(){
                    return super.getNextValue();
                }
            }); /* Aqui basicamente me ahorro crear una clase que herede el modelo para poder Reescribirlo */
            
            
            
            spinner3.setPreferredSize(new Dimension(100, 20));
            // ---------- Codigo de internet ---------------------------
            JSpinner.DefaultEditor sEditor = (JSpinner.DefaultEditor)spinner3.getEditor();
            JFormattedTextField text = (JFormattedTextField)sEditor.getComponent(0);       
            text.setHorizontalAlignment(JFormattedTextField.CENTER);
            //--------------------------------------------------------------------
            
            add(spinner);
            add(spinner2);
            add(spinner3);
        }
    }
    
    
}

