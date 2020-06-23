/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronDecorator;

/**
 *
 * @author Santiago
 */
public class AgenciaViajes {
    private String cliente;
    private int precioViaje;
    
    public AgenciaViajes(String c){
        this.cliente = c;
    }
    
    public String getClient(){
        return this.cliente;
    }
    
    public void setPrecioViaje(int preciov){
        this.precioViaje = preciov;
    }
    
    public int getPrecioViaje(){
        return this.precioViaje;
    }
    
}
