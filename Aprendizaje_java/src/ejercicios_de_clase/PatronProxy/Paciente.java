/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.PatronProxy;

/**
 *
 * @author Santiago
 */
public class Paciente {
    private final String nombre;
    private boolean isSick;
    
    public Paciente(String name){
        this.nombre = name;
        isSick = true;
    }
    
    public String getName(){
        return this.nombre;
    }
    
    public boolean isSick(){
        return this.isSick;
    }
    
    public void setisSick(boolean t){
        this.isSick = t;
    }
}
