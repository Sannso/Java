/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author Santiago
 */
public class Inicio_sesion_cuadros_texto {
    static public void main(String[] args){
        Isesion v;
        v = new Isesion();
        
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class Isesion extends JFrame{
    
    private Button botonV;
    private JTextField cuadroNombre;
    private JPasswordField cuadroContraseña;
    private boolean validacion = false;
    
    public Isesion(){
        this.setSize(550, 370);
        this.setLocation(200, 200);
        this.setTitle("Inicio Sesion");
        
        this.setLayout(new BorderLayout(30, 30));
        
        PanelSesion pSesion = new PanelSesion();
        PanelBotonV pBotonV = new PanelBotonV();
        
        add(pSesion, BorderLayout.NORTH);
        add(pBotonV, BorderLayout.CENTER);
    }
    
    class PanelSesion extends JPanel{
        public PanelSesion(){
            cuadroNombre = new JTextField(10);
            cuadroContraseña = new JPasswordField(10);
            
            this.setLayout(new GridLayout(3, 3, 5, 5));
            
            add(new JLabel("Ingrese su nombre de Usuario: "));
            add(cuadroNombre);
            
            add(new JLabel("Ingrese su contraseña: "));
            add(cuadroContraseña);
            
            add(new JLabel());
            add(new JLabel("Need more than 8 characters and less than 15"));
            
            Document docPassField = cuadroContraseña.getDocument();
            docPassField.addDocumentListener(new DocPassField());
        }
    }
    
    class DocPassField implements  DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent de) {
            String passField = cuadroContraseña.getText();
            
            if(passField.length() > 8 && passField.length() < 11){
                //char lastLetter = passField.charAt((passField.length()-1));
                //passW += String.valueOf(lastLetter);
                cuadroContraseña.setBackground(Color.WHITE);
                validacion = true;
            }
            else{
                validacion = false;
                cuadroContraseña.setBackground(Color.RED);
            }
            
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
            String passField = cuadroContraseña.getText();
            
            if(passField.length() > 8 && passField.length() < 15){
                
                cuadroContraseña.setBackground(Color.WHITE);
                validacion = true;
            }
            else{
                validacion = false;
                cuadroContraseña.setBackground(Color.RED);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
            
        }
        
    }
    
    
    class PanelBotonV extends JPanel{
        public PanelBotonV(){
            botonV = new Button("Iniciar Sesion");
            add(botonV);      
            
            botonV.addActionListener(new BotonVAc());
        }
    }
    
    class BotonVAc implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String nombre = cuadroNombre.getText();
            String pass = cuadroContraseña.getText();
            
            System.out.println("Usuario: " + nombre);
            System.out.println("Contraseña: " + pass);
            
            if(validacion){
                System.out.println("Se ha iniciado sesion correctamente");
            }
            else{
                System.out.println("No se ha podido iniciar sesion");
            }
        }
        
    }
    
}


