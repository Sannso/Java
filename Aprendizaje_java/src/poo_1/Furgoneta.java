/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1;

/**
 *
 * @author Santiago
 */
public class Furgoneta extends Coche {
    
    private int capacidad_carga;
    private int plazas_extra;
    
    public Furgoneta(int capacidad_carga, int plazas_extra){
        super(); // Llama al constructor de la clase padre
        
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;
    }
   
    
    public String getDatosFurgoneta(){
        return "La capacidad de la furgoneta es: " + capacidad_carga +
                "\nLas plazas extras son: " + plazas_extra;
    }
    
}
