/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author Santiago
 */
public class Eventos_cuadros_de_txt {
    public static void main(String[] args){
        VcT mif;
        mif = new VcT();
        mif.setVisible(true);
        mif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class VcT extends JFrame{
    public VcT(){
        this.setSize(480, 360);
        this.setLocation(200, 200);
        this.setTitle("Eventos en Cuadros de texto");
        
        add(new Cet());
    }
}

class Cet extends JPanel{
    public Cet(){
        JTextField Cuadrito;
        Cuadrito = new JTextField(14);
        
        Document docCuadri = Cuadrito.getDocument();
        add(Cuadrito);
        docCuadri.addDocumentListener(new DocListen());
    }
}

class DocListen implements DocumentListener{

    @Override
    public void insertUpdate(DocumentEvent de) {
        System.out.println("Se inserto texto");
    }

    @Override
    public void removeUpdate(DocumentEvent de) {
        System.out.println("Se suprimio texto");
    }

    @Override
    public void changedUpdate(DocumentEvent de) {
        
    }
    
}