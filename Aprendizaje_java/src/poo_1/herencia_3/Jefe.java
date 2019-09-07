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
public class Jefe extends Empleado {
    
    private double incentivo=0;
    
    public Jefe(String nombre, double sueldo, int anyo, int mes, int dia){
        super(nombre, sueldo, anyo, mes, dia);
    }
    
    public void makeIncentivo(double i){
        incentivo = i;
    }

    @Override
    public double getSueldo() {
        double sueldoJefe = super.getSueldo();
        
        return sueldoJefe + incentivo; 
    }

    @Override
    public String getDatos() {
        return "Datos del empleado y jefe:"
                + "\nNombre: " + super.getNombre()
                + "\nId: " + super.getID()
                + "\nSueldo: " + getSueldo()
                + "\nAlta del contrato: " + super.getAltaContrato();
    }
    
    
    
}
