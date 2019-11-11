/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Santiago
 */
public class JSlider_deslizante {
    public static void main(String[] args){
        JSliderFrame v;
        v = new JSliderFrame();
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class JSliderFrame extends JFrame{
    
    private JLabel text;
    private JSlider desli;
    
    public JSliderFrame(){
        this.setSize(400, 200);
        this.setLocation(200, 200);
        this.setTitle("JSlider - deslizante");
        
        this.setLayout(new BorderLayout(5,30));
        
        
        
        add(new TextoPanel(), BorderLayout.CENTER);
        add(new JSliderPanel(), BorderLayout.NORTH);
    }
    
    class TextoPanel extends JPanel{
        public TextoPanel(){
            text = new JLabel("Este texto es de prueba");
            text.setFont(new Font("consola", Font.PLAIN, 20));

            add(text);
        }
    }
    
    
    class JSliderPanel extends JPanel{
        public JSliderPanel(){
            desli = new JSlider(10, 35, 20);

            desli.setMajorTickSpacing(25);
            desli.setMinorTickSpacing(5);
            desli.setPaintTicks(true);
            desli.setPaintLabels(true);
            desli.setSnapToTicks(true);

            desli.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent ce) {
                    int valorDesli = desli.getValue();
                    text.setFont(new Font("consola", Font.PLAIN, valorDesli));
                }
            });
            
            add(desli);
        }
    }
}




