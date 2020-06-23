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
public class Prestamo {
    private boolean tienePrestamo;
    
    public Prestamo(){
        tienePrestamo = false;
    }
    
    public boolean getTienePrestamo(){
        return tienePrestamo;
    }
    
    public void setTienePrestamo(boolean hc){
        this.tienePrestamo = hc;
    }
}
