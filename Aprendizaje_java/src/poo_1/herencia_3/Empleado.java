/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1.herencia_3;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Santiago
 */
public class Empleado extends Persona implements Comparable, Bonus_empleados{
    //private final String nombre;
    private double sueldo;
    private static int RaID = 1;
    private final int ID;
    private final Date altaContrato;
    
    public Empleado(String nombre,double sueldo,
            int anyo_alta, int mes_alta, int dia_alta){
        
        super(nombre); //this.nombre = nombre;
        this.sueldo = sueldo;
        
        //Se crea una fecha
        GregorianCalendar fecha;
        fecha = new GregorianCalendar(anyo_alta, mes_alta-1, dia_alta);
        
        //Se asigna esa fecha a esta variable tipo Date
        altaContrato = fecha.getTime(); // getTime:
                                            // devuelve un objeto de tipo Date
                                            // Por eso se pueden igualar
    
        ID = RaID;
        RaID++;
    }
    
    /*
    public String getNombre() {
        return nombre;
    }
    */ 
    
    public double getSueldo() {
        return sueldo;
    }

    public int getID() {
        return ID;
    }
    
    public Date getAltaContrato() {
        return altaContrato;
    }
    
    public void setSueldo(double porcentaje){
        double porcent = sueldo * porcentaje/100;
        sueldo+= porcent;
    }
    
    @Override
    public String getDatos(){
        return "Datos del empleado:"
                + "\nNombre: " + super.getNombre()
                + "\nId: " + ID
                + "\nSueldo: " + sueldo
                + "\nAlta del contrato: " + altaContrato;
    }
    
    
    @Override
    public int compareTo(Object unObjeto){
        
        Empleado castEmpleado = (Empleado) unObjeto;
        
        if(this.sueldo < castEmpleado.sueldo ){
            return -1;
        }
        
        else if(this.sueldo > castEmpleado.sueldo ){
            return 1;
        }
        
        else{
            return 0;
        }
        
    }
    
    
    @Override
    public double crearBonificacion(double bonificacion){
        return bonificacion+BONUS_BASE;
    }
    
}
