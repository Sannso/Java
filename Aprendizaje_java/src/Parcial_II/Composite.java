/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_II;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Santiago
 */
public class Composite implements IComponente{
    private String nombre;
    private ArrayList listaIComponente = new ArrayList();
    
 
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public float getPrecioNeto() {
        float total=0;
        for(Iterator i=crearIterator(); i.hasNext(); ){
            total+= i.next().get
        }
            
        return total;
    }

    
    
    
    @Override
    public void añadir(IComponente e) {
        listaIComponente.add(e);
    }

    @Override
    public void eliminar(IComponente e) {
        listaIComponente.remove(e);
    }

    @Override
    public Iterator crearIterator() {
        return listaIComponente.iterator();
    }
}
