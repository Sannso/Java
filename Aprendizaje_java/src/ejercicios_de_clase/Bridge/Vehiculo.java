/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.Bridge;

/**
 *
 * @author Santiago
 */
public abstract class Vehiculo {
    
    protected Implementacion impl;
    
    public Vehiculo(Implementacion i){
        impl = i;
    }
    
    public void setImplementation(Implementacion i){
        impl = i;
    }
    
    public abstract void procesar();
}
