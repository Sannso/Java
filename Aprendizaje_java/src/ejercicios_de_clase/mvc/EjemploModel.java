/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_de_clase.mvc;

/**
 *
 * @author Santiago
 */
public class EjemploModel {
    
    private int iD;
    private String nombre;
    
    public EjemploModel(){
        iD = 1;
    }
    
    public String getName(){
        return nombre;
    }
    
    public void setName(String name){
        this.nombre = name;
    }
    
    public String getId(){
        return String.valueOf(iD);
    }
}
