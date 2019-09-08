/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1.herencia_3;

/**
 *
 * @author Santiago
 */
public interface Jefe_interface extends Bonus_empleados {
    
    public abstract String tomarDesiciones(String desicion); 
                    // las interfaces no se vuelven abstractas
                        // por tener metodos abtractos
    
}
