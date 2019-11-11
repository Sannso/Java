/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author Santiago
 */
public class Eventos_multiples_fuentes {
    public static void main(String[] args){
        
        Ventana_multipleEvento asd;
        asd = new Ventana_multipleEvento();
        
        asd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class Ventana_multipleEvento extends JFrame{
    
    
    public Ventana_multipleEvento(){
        this.setBounds(200, 200, 720, 260);
        this.setTitle("Pruebas con botones");
        
        add(new Capa_botones_eventM());
        
        //NOTA IMPORTANTISIMA:
              // La visibilidad de la Ventana siempre
              // deberia ir de ultima instancia
        this.setVisible(true);
    }
    
    
    
    
    private class Capa_botones_eventM extends JPanel{

        public Capa_botones_eventM(){

            Icon iconoBotones;
            iconoBotones = new ImageIcon
                                ("src/aplicaciones_graficas_swing/gatoPeque.gif");


            ClaseEvent_Boton contenidoBAmarillo;
            ClaseEvent_Boton contenidoBVerde;
            ClaseEvent_Boton contenidoBRosa;

            contenidoBAmarillo = new ClaseEvent_Boton("Amarillo",
                                                    iconoBotones, Color.YELLOW);

            contenidoBVerde = new ClaseEvent_Boton("Verde",
                                                    iconoBotones, Color.GREEN);

            contenidoBRosa = new ClaseEvent_Boton("Rosa",
                                                    iconoBotones, Color.PINK);

            /* PARA SIMPLIFICAR EL CODIGO NADA MAS, SOLO LO AGREGO EN EL add
            JButton botonAmarillo = new JButton(contenidoBAmarillo);
            */      
            add(new JButton(contenidoBAmarillo));
            add(new JButton(contenidoBVerde));
            add(new JButton(contenidoBRosa));

            
            
            // -----------------------------------------------------------------
            
            
            // Se procede a agregar la segunda fuente para cambiar de color
            // el fondo, con una combinacion de teclas.
            
            // Utilizamos un "Mapa" (aun no lo entiendo muy bien) para asignarle
            // combinaciones de teclas.
            
            InputMap mapaCombinacioneT =
                    getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
            
                    // Aqui creamos el mapa y le asignamos la condicion de que
                    // "Sirva" cuando el foco esta en la ventana, en este caso 
                    // en el JPanel
                    
            // ---------- Ahora creamos los KeyStroke al Mapa -----------------
            mapaCombinacioneT.put(KeyStroke.getKeyStroke("ctrl A"),
                                    "Combinacion_Amarillo");
                    
                    // El primer parametro pues es la forma de agregar
                    // la combinacion de teclas, que en este caso 
                    // tiene forma de String, pero podria tener otra. 
                    
                    // Y el segundo parametro es el nombre del objeto que
                    // le asignamos a esta combinacion de teclas
            
            
            mapaCombinacioneT.put(KeyStroke.getKeyStroke("ctrl V"),
                                    "Combinacion_Verde");
            
            mapaCombinacioneT.put(KeyStroke.getKeyStroke("ctrl R"),
                                    "Combinacion_Rosa");
            
           
            // -------- Ahora procedemos a asignarle un evento ----------------
            // a el mapa o lo que contiene.
            // Creando el mapa de acciones y poniendo cada uno
            
            ActionMap accionCombinacionesMap = getActionMap();
            
            accionCombinacionesMap.put("Combinacion_Amarillo",
                                                contenidoBAmarillo);
            
                    // En el primer parametro ponemos el nombre del objeto
                    // que tiene la combinacion de teclas
                    
                    // Y el segundo es la accion que le proporcionamos
                    // a esa combinacion de teclas
            
            accionCombinacionesMap.put("Combinacion_Verde", contenidoBVerde);
            accionCombinacionesMap.put("Combinacion_Rosa", contenidoBRosa);
        }

        
        
        
        
        class ClaseEvent_Boton extends AbstractAction{

            public ClaseEvent_Boton(String nombre, Icon icon1, Color color_bg){
                this.putValue(Action.NAME, nombre);
                this.putValue(Action.SMALL_ICON, icon1);
                this.putValue(Action.SHORT_DESCRIPTION,
                        "Poner el fondo de color: " + nombre);

                this.putValue("poner_ColorFondo", color_bg);
            }

            @Override
            public void actionPerformed(ActionEvent ae) {
                Color colorBG =(Color) this.getValue("poner_ColorFondo");

                setBackground(colorBG);
               
            }

        }
        
        
    }



    
}











