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
public interface IComponente {
    public String getNombre();
    public float getPrecioNeto();
    public void añadir(IComponente e);
    public void eliminar(IComponente e);
    public Iterator crearIterator();
}
