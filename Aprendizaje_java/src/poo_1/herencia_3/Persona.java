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
public abstract class Persona {
    private final String nombre;
    
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract String getDatos();
    
    
}
