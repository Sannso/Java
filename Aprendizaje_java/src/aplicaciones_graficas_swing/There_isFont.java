/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones_graficas_swing;

import java.awt.GraphicsEnvironment;

/**
 *
 * @author Santiago
 */
public class There_isFont {
    
    public static boolean verificarFuente(String fuente){
        
        String[] fuentesPc;
        boolean exist = false;
        
        // Con esto logramos guardar en un array las fuentes
        // que existan en el pc
        fuentesPc = GraphicsEnvironment.getLocalGraphicsEnvironment().
                getAvailableFontFamilyNames();
        
       for(String f: fuentesPc){
           if(f.equals(fuente)){
               exist = true;
           }
       }
        
        return exist;
    }
}
