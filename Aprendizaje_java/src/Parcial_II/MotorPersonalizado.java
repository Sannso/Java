/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_II;

import java.util.Iterator;

/**
 *
 * @author Santiago
 */
public class MotorPersonalizado implements IComponente{
    private String nombre;
    private float precio;
    
    public MotorPersonalizado(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public String getNombre() {
        return "Motor";
    }

    @Override
    public float getPrecioNeto() {
        return this.precio;
    }

    
    
    
    @Override
    public void añadir(IComponente e) {}

    @Override
    public void eliminar(IComponente e) {}

    @Override
    public Iterator crearIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
