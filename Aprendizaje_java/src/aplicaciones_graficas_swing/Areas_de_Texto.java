/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

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
public class Areas_de_Texto {
    public static void main(String[] args){
        AtFrame fd;
        fd = new AtFrame();
        fd.setVisible(true);
        fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class AtFrame extends JFrame{
    public AtFrame(){
        this.setSize(500, 350);
        this.setLocation(200, 200);
        this.setTitle("Areas de texto");
        
        add(new AtPanel());
    }
}

class AtPanel extends JPanel{
    
    JTextArea areaTxt;
    
    public AtPanel(){
        areaTxt = new JTextArea(8, 15);
        areaTxt.setLineWrap(true);
        
        JScrollPane panelScroll;
        panelScroll = new JScrollPane(areaTxt);
        
        add(panelScroll);
        
        JButton bGo;
        bGo = new JButton("GO");
        add(bGo);
        bGo.addActionListener(new BGoActionL());
        
    }
    
    private class BGoActionL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String outputAreaTxt = areaTxt.getText();
            System.out.println(outputAreaTxt);
        }
        
    }
    
}