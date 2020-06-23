/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronFacade;

/**
 *
 * @author Santiago
 */
public class Banco {
    private boolean fondos;
    
    public Banco(){
        fondos = true;
    }
    
    public boolean getFondos(){
        return fondos;
    }
    
    public void setFondos(boolean fondos){
        this.fondos = fondos;
    }
}
