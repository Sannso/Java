/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Calculadora_sencilla {
    public static void main(String[] args){
        
        Interfase_Calculadora calcu;
        calcu = new Interfase_Calculadora();
        
        calcu.setVisible(true);
        calcu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Interfase_Calculadora extends JFrame{

    //private String respuesta = "0";
    JButton ScreenButton;
    
    public Interfase_Calculadora(){
        this.setSize(250, 300);
        this.setLocation(250, 250);
        this.setTitle("Calculadora");
        
        this.setLayout(new BorderLayout(10, 10));
        
        add(new CapaRespuesta(), BorderLayout.NORTH);
        add(new Teclado());
    }
   
    
    private class CapaRespuesta extends JPanel{
        public CapaRespuesta(){
            this.setLayout(new FlowLayout(FlowLayout.RIGHT));
            
            
            ScreenButton = new JButton("0");
            
            ScreenButton.setEnabled(false);
            //ScreenButton.setText("Cambiazo");
            
            add(ScreenButton);
        }
    }
    
    
    private class Teclado extends JPanel{
        public Teclado(){
            this.setLayout(new GridLayout(4, 4, 10, 10));
            
            // Primera fila
            CrearBotones("7");
            CrearBotones("8");
            CrearBotones("9");
            CrearBotones("+");
            
            // Segunda fila
            CrearBotones("4");
            CrearBotones("5");
            CrearBotones("6");
            CrearBotones("-");
            
            // Tercera fila
            CrearBotones("1");
            CrearBotones("2");
            CrearBotones("3");
            CrearBotones("*");
            
            // Cuarta fila
            CrearBotones("");
            CrearBotones("0");
            CrearBotones("");
            CrearBotones("=");
        }
        
        private void CrearBotones(String valor){
            JButton newButton = new JButton(valor);
            add(newButton);
            newButton.addActionListener(new OyenteOperaciones());
        }
    }
    
    
    class OyenteOperaciones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            String TextoEnPantalla = ScreenButton.getText();
            String ReturnDelBoton = ae.getActionCommand();
            
            if(ReturnDelBoton.equals("*") || ReturnDelBoton.equals("+")
                || ReturnDelBoton.equals("-") || ReturnDelBoton.equals("=")){
                
                if(ReturnDelBoton.equals("=")){
                    // ------------------- Operaciones -----------------------
                    System.out.println("Llega");
                    String CopiaResultado = "";
                    String pivote = "";
                    int HacerOperacion = 0;
                    String Operador = "";
                    
                    for(int i = 0; i<TextoEnPantalla.length(); i++){
                        String ScreenChar = String.valueOf(TextoEnPantalla.charAt(i));
                        System.out.println(ScreenChar);
                        if(ScreenChar.equals("*") || ScreenChar.equals("+")
                            || ScreenChar.equals("-")){
                            
                            HacerOperacion++;
                            
                            if(HacerOperacion == 2){
                                if(Operador.equals("*")){
                                    CopiaResultado =
                                        String.valueOf(
                                            (Integer.parseInt(CopiaResultado) *
                                                Integer.parseInt(pivote)));
                                }
                                else if(Operador.equals("+")){
                                    CopiaResultado =
                                        String.valueOf(
                                            (Integer.parseInt(CopiaResultado) +
                                                Integer.parseInt(pivote)));
                                }
                                else{
                                    CopiaResultado =
                                        String.valueOf(
                                            (Integer.parseInt(CopiaResultado) -
                                                Integer.parseInt(pivote)));
                                }
                                
                                pivote = "";
                                HacerOperacion = 1;
                                
                            }
                            
                            Operador = ScreenChar;
                            
                        }
                        else if(HacerOperacion == 0){
                            CopiaResultado = CopiaResultado
                                                    + TextoEnPantalla.charAt(i);
                        }
                        else if(HacerOperacion == 1){
                            pivote = pivote + TextoEnPantalla.charAt(i);
                        }
                    }
                    
                    
                    
                    if(HacerOperacion == 1){
                        if(Operador.equals("*")){
                             ScreenButton.setText(String.valueOf(
                                            (Integer.parseInt(CopiaResultado) *
                                                Integer.parseInt(pivote))));
                        }
                        else if(Operador.equals("+")){
                            ScreenButton.setText(String.valueOf(
                                            (Integer.parseInt(CopiaResultado) +
                                                Integer.parseInt(pivote))));
                        }
                        else{
                            ScreenButton.setText(String.valueOf(
                                            (Integer.parseInt(CopiaResultado) -
                                                Integer.parseInt(pivote))));
                        }
                                 
                    }
                    
                    
                    
                }
                else{
                    if(TextoEnPantalla.equals("0")){
                    }
                    else{
                        ScreenButton.setText(TextoEnPantalla + ReturnDelBoton);
                    }
                }
                
            }
            else{
                if(TextoEnPantalla.equals("0")){
                    ScreenButton.setText(ReturnDelBoton);
                }
                else{
                    ScreenButton.setText(TextoEnPantalla + ReturnDelBoton);
                }
            }
            
            
            
        }
        
    }
    
    
}

