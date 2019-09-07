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
public class Estudiante extends Persona {
    
    private final String carrera;
    
    public Estudiante(String nombre, String carrera){
        super(nombre);
        this.carrera = carrera;
    }
    
    @Override
    public String getDatos(){
        return "Datos del estudiante:"
                + "\nNombre: " + super.getNombre()
                + "\nCarrera: " + carrera;
    }
    
}
