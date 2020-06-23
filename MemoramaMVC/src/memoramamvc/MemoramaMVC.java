/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoramamvc;

/**
 *
 * @author Santiago,Camila,Luba,Edison y Esteban
 */
public class MemoramaMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        View vista = new View();
        Model modelo = new Model();
        
        Controller controlador = new Controller(modelo, vista);
    }
    
}
